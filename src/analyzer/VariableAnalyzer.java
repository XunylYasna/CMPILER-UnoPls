package analyzer;

import Managers.symbolTable.LocalScope;
import antlr.UnoPlsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.Value;


// Handles all variable declarations, variable initialization, variable re assignment

public class VariableAnalyzer implements ParseTreeListener {
    LocalScope scope;
    String id;
    PrimitiveType primitiveType = PrimitiveType.fromString("ewan");
    String expression;

    Value value;


    public VariableAnalyzer(LocalScope scope){
        this.scope = scope;
    }

    public void analyze(UnoPlsParser.LocalVariableDeclarationContext localVarDecCtx) {
        //Walk the parse tree to get necessary values
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, localVarDecCtx);
        this.value = new Value(expression, primitiveType);
        scope.addVariable(id,value);

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
        if(parserRuleContext instanceof UnoPlsParser.IntegralTypeContext) {
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


        if(parserRuleContext instanceof UnoPlsParser.IdentifierContext) {
            this.id = parserRuleContext.getText();
        }

        if(parserRuleContext instanceof UnoPlsParser.ExpressionContext) {
            this.expression = parserRuleContext.getText();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
