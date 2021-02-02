package analyzer;

import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.UnoFunction;
import representations.Value;

import java.util.HashMap;

public class FunctionDeclarationAnalyzer implements ParseTreeListener {

    PrimitiveType resultType;
    String functionName;
    HashMap<String, Value> parameters;

    public FunctionDeclarationAnalyzer(){
        parameters = new HashMap<>();
    }

    public void analyze(UnoPlsParser.FunctionDeclarationContext functionDeclarationContext){
//        System.out.println(functionDeclarationContext.getText());

        //Create a new function object
        PrimitiveType resultType = PrimitiveType.fromString(functionDeclarationContext.methodHeader().result().getText()); // gets result type
        String functionName = functionDeclarationContext.methodHeader().methodDeclarator().identifier().getText(); // get function name
        System.out.println("Function declaration: " + functionName);
        UnoFunction unoFunction = new UnoFunction(functionName,null,resultType);

        SymbolTableManager.getInstance().addFunction(functionName, unoFunction);

        //Walk the context in order to initialize variables

        //Set current uno function in order to pass it to other visit commands
        SymbolTableManager.getInstance().setCurrentFunction(unoFunction);
        SymbolTableManager.getInstance().setCurrentScope(unoFunction.getFunctionScope());

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, functionDeclarationContext);

        // After the walk, the local variables of the scope's function will contain the parameters
        parameters = SymbolTableManager.getInstance().getCurrentFunction().getFunctionScope().getLocalVariables();
        // Set the parameters in order to reassign them at function call
        unoFunction.initParameters(parameters);

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
//        if(parserRuleContext instanceof )
        if(parserRuleContext instanceof UnoPlsParser.FormalParameterContext){
            UnoPlsParser.FormalParameterContext formalParameterContext = (UnoPlsParser.FormalParameterContext) parserRuleContext;
            VariableAnalyzer variableAnalyzer = new VariableAnalyzer();
            variableAnalyzer.analyze(formalParameterContext);
        }

        if(parserRuleContext instanceof UnoPlsParser.MethodBodyContext) {
            UnoPlsParser.BlockContext blockCtx = ((UnoPlsParser.MethodBodyContext) parserRuleContext).block();
            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
            blockAnalyzer.analyze(blockCtx);
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
