package commands.simple;

import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.UnoFunction;
import representations.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionCallCommand implements ICommand, ParseTreeListener {


    private UnoPlsParser.MethodInvocationContext methodInvocationContext; // nagkamali ako una kalo ko function caller yung sa grammar methodinvocation pala
    private UnoFunction unoFunction;
    private UnoPlsParser.ExpressionContext expressionContext;
    private String functionName;

    private ArrayList<Value> parameterValue;

    public FunctionCallCommand(UnoPlsParser.MethodInvocationContext methodInvocationContext){
        this.methodInvocationContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        // get function template, the function template does not need to be cloned because all we want is the ICommand List,
        //                        The parameters are reset every function call
        unoFunction = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = unoFunction.getFunctionName();

        //walk the function call to get parameters
        parameterValue = new ArrayList<>();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.methodInvocationContext);


    }

    @Override
    public void execute() {
        System.out.println("executing function call: " + functionName + "" );
        SymbolTableManager.getInstance().setCurrentFunction(this.unoFunction);
        SymbolTableManager.getInstance().setCurrentScope(this.unoFunction.getFunctionScope());
        // set the paremeters of the function
        this.unoFunction.setParameters(parameterValue);
        for (ICommand command: unoFunction.getCommandList()) {
            command.execute();
        }
        SymbolTableManager.getInstance().setCurrentFunction(SymbolTableManager.getInstance().findFunction("main"));
        SymbolTableManager.getInstance().setCurrentScope(SymbolTableManager.getInstance().findFunction("main").getFunctionScope());
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        // if the function call encounters an expression, the expression is counted as a parameter of the function
        if(parserRuleContext instanceof UnoPlsParser.ExpressionContext){
//            Value parameterValue = new EvaluateCommand((UnoPlsParser.ExpressionContext) parserRuleContext);
            EvaluateCommand evaluateCommand = new EvaluateCommand((UnoPlsParser.ExpressionContext) parserRuleContext);
            evaluateCommand.execute();

            Value tempValue = new Value(evaluateCommand.evaluateExpression(), PrimitiveType.EWAN);
            parameterValue.add(tempValue);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
