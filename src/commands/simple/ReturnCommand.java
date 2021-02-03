package commands.simple;

import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;
import representations.UnoFunction;
import representations.Value;

public class ReturnCommand implements ICommand {
    private UnoPlsParser.ExpressionContext expressionContext;
    private UnoFunction unoFunction;

    public ReturnCommand(UnoPlsParser.ExpressionContext expressionContext, UnoFunction unoFunction) {
        this.expressionContext = expressionContext;
        this.unoFunction = unoFunction;
    }

    @Override
    public void execute() {

        EvaluateCommand evaluationCommand = new EvaluateCommand(this.expressionContext);
        evaluationCommand.execute();
        Object value = evaluationCommand.evaluateExpression();
        Value functionReturn = unoFunction.getReturnValue();
        functionReturn.setValue(value);

        System.out.println("Return " + (String) functionReturn.getValue());
    }
}
