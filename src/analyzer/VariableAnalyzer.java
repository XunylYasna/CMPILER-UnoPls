package analyzer;

import Managers.errors.SemanticErrorManager;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.Value;


// Handles all variable declarations, variable initialization, variable re assignment

public class VariableAnalyzer implements ParseTreeListener {
    String id;
    PrimitiveType primitiveType = PrimitiveType.fromString("ewan");
    UnoPlsParser.ExpressionContext variableExpression;
    String expression;

    Value value;


    public VariableAnalyzer(){
    }


    public void analyze(UnoPlsParser.LocalVariableDeclarationContext localVarDecCtx) {
        //Walk the parse tree to get necessary values
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, localVarDecCtx);

        EvaluateCommand evaluateCommand = new EvaluateCommand(variableExpression);
        evaluateCommand.execute();
        this.value = new Value(evaluateCommand.evaluateExpression(), primitiveType);

        System.out.println("created variable " + this.id + " " + this.value.getValue().toString());

        if(SymbolTableManager.getInstance().getCurrentScope().containsVariableAllScopes(id)){
            SemanticErrorManager.getInstance().addSemanticError("Semantic Error("+
                    localVarDecCtx.getStart().getLine()+":"+localVarDecCtx.getStart().getCharPositionInLine()
            + ") Invalid declaration. Variable '" + id + "' is already declared");
        }
        else{
            SymbolTableManager.getInstance().getCurrentScope().addVariable(id,value);
        }
    }

    // For analyzing variables inside a parameter
    public void analyzeParameter(UnoPlsParser.FormalParameterContext formalParameterContext){
        //
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, formalParameterContext);
        this.value = new Value(expression, primitiveType);
//        SymbolTableManager.getInstance().getCurrentFunction().getFunctionScope().addVariable(id, value);
    }

    public String getId() {
        return id;
    }

    public Value getValue(){
        return value;
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

        //Primitive Types
        if(parserRuleContext instanceof UnoPlsParser.IntegralTypeContext) { // char, byte, int
            this.primitiveType = PrimitiveType.fromString(parserRuleContext.getText());
        }
        if(parserRuleContext instanceof UnoPlsParser.FloatingPointTypeContext) {
            this.primitiveType = PrimitiveType.FLOAT;
        }
        if(parserRuleContext instanceof UnoPlsParser.UnannPrimitiveTypeContext){
            if(parserRuleContext.getText().equals("boolean")){
                this.primitiveType = PrimitiveType.BOOL;
            }
        }
        if(parserRuleContext instanceof UnoPlsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext){
            //not sure but in order to make sure you can check one level below to check if identifier
            if(parserRuleContext.getChildCount() == 1){
                this.primitiveType = PrimitiveType.STRING;
            }
        }

        // Get variable name
        if(parserRuleContext instanceof UnoPlsParser.VariableDeclaratorIdContext) {
            this.id = parserRuleContext.getText();
        }
//        if(parserRuleContext instanceof UnoPlsParser.IdentifierContext) {
//            this.id = parserRuleContext.getText();
//        }

        // Get variable value
        if(parserRuleContext instanceof UnoPlsParser.VariableInitializerContext) {
            this.variableExpression = ((UnoPlsParser.VariableInitializerContext) parserRuleContext).expression();
            this.expression = parserRuleContext.getText();
        }
//        if(parserRuleContext instanceof UnoPlsParser.ExpressionContext) {
//            this.expression = parserRuleContext.getText();
//        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
