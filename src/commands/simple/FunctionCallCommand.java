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


    private UnoPlsParser.MethodInvocationContext methodInvocationContext;
    private UnoPlsParser.MethodInvocation_lfno_primaryContext methodInvocation_lfno_primaryContext;
    private UnoFunction unoFunction;
    private UnoFunction parentFunction;
    private UnoPlsParser.ExpressionContext expressionContext;
    private String functionName;
    private boolean isNormalCall;
    private ArrayList<Value> parameterValue;

    public FunctionCallCommand(UnoPlsParser.MethodInvocationContext methodInvocationContext){
        isNormalCall = true;
        this.methodInvocationContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        // get function template, the function template does not need to be cloned because all we want is the ICommand List,
        //                        The parameters are reset every function call
        unoFunction = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = unoFunction.getFunctionName();

        //walk the function call to get parameters
        parameterValue = new ArrayList<>();

    }

    public FunctionCallCommand(UnoPlsParser.MethodInvocation_lfno_primaryContext methodInvocationContext){
        isNormalCall = false;
        this.methodInvocation_lfno_primaryContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        // get function template, the function template does not need to be cloned because all we want is the ICommand List,
        //                        The parameters are reset every function call
        unoFunction = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = unoFunction.getFunctionName();
        System.out.println("Function call in variable assignment in " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());

        parameterValue = new ArrayList<>();

    }

    public Value evaluateFunctionCall(){
//        System.out.println("Executing function call in an expression in function " + parentFunction.getFunctionName());
        this.execute();
        return this.unoFunction.getReturnValue();
    }

    @Override
    public void execute() {
        System.out.println("Executing function call: " + functionName + "" );
        parentFunction = SymbolTableManager.getInstance().getCurrentFunction();
        // set the paremeters of the function
        //walk the function call to get parameters
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        if(isNormalCall){
            treeWalker.walk(this, this.methodInvocationContext);
        }
        else{
            treeWalker.walk(this, this.methodInvocation_lfno_primaryContext);
        }
        this.unoFunction.setParameters(parameterValue);
        SymbolTableManager.getInstance().setCurrentFunction(this.unoFunction);
        SymbolTableManager.getInstance().setCurrentScope(this.unoFunction.getFunctionScope());
        for (ICommand command: unoFunction.getCommandList()) {
            command.execute();
        }
        SymbolTableManager.getInstance().setCurrentFunction(parentFunction);
        SymbolTableManager.getInstance().setCurrentScope(parentFunction.getFunctionScope());
    }

    public void getReturn(){

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
