package commands.controlled;

import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;

import java.util.ArrayList;

public class WhileCommand implements IControlledCommand{
    private ArrayList<ICommand> commandList;
    private UnoPlsParser.ExpressionContext expressionContext;

    public WhileCommand(UnoPlsParser.ExpressionContext expression) {
        expressionContext = expression;
        commandList = new ArrayList<>();
    }

    @Override
    public void execute() {
        EvaluateCommand evaluateCommand = new EvaluateCommand(expressionContext);
        evaluateCommand.execute();
        boolean shakesphere = false;
        if(Double.valueOf((String) evaluateCommand.evaluateExpression()) > 0.0){
            shakesphere = true;
        }
        if(shakesphere){
            for(ICommand command: commandList){
                command.execute();
            }
            this.execute();
        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.WHILE_CONTROL;
    }

    @Override
    public void addCommand(ICommand command) {
        commandList.add(command);
    }


}
