package commands.simple;

import Managers.io.OutputManager;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintCommand implements ICommand, ParseTreeListener {

    private UnoPlsParser.FunctionCallerContext functionCallerContext;
    private UnoPlsParser.ExpressionContext expressionContext;

    String evaluatedExpression;

    public PrintCommand(UnoPlsParser.FunctionCallerContext functionCallerContext){
        this.functionCallerContext = functionCallerContext;
    }


    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.functionCallerContext);
        EvaluateCommand evaluateCommand = new EvaluateCommand(expressionContext);
        evaluateCommand.execute();
        this.evaluatedExpression = (String) evaluateCommand.evaluateExpression();
        System.out.println("Executing Print Command in function: " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
        OutputManager.getInstance().addoutputLog(evaluatedExpression);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof UnoPlsParser.ExpressionContext){
            this.expressionContext = (UnoPlsParser.ExpressionContext) parserRuleContext;
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
