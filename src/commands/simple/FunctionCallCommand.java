package commands.simple;

import antlr.UnoPlsParser;
import commands.ICommand;
import representations.UnoFunction;

public class FunctionCallCommand implements ICommand {


    private UnoFunction unoFunction;
    private UnoPlsParser.ExpressionContext expressionContext;
    private String functionName;

    @Override
    public void execute() {

    }
}
