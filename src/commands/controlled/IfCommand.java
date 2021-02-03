package commands.controlled;

import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;

import java.util.*;

public class IfCommand implements IConditionalCommand {

    private ArrayList<ICommand> positiveCommands; //list of commands to execute if the condition holds true
    private ArrayList<ICommand> negativeCommands; //list of commands to execute if the condition holds false

    private UnoPlsParser.ExpressionContext conditionalExpression;

    public IfCommand(UnoPlsParser.ExpressionContext conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
        this.positiveCommands = new ArrayList<>();
        this.negativeCommands = new ArrayList<>();
    }

    @Override
    public void execute() {
        //Check evalute conditional expression if true ba or hindi
        EvaluateCommand evaluateCommand = new EvaluateCommand(conditionalExpression);
        evaluateCommand.execute();
        Object evaluation = evaluateCommand.evaluateExpression();
        boolean shakesphere = false;
        if(Double.valueOf((String) evaluation) > 0.0){
            shakesphere = true;
        }

        System.out.println("Executing Commands inside of if - " + shakesphere);

        if(shakesphere){
            System.out.println("positive");
            for (ICommand command: positiveCommands) {
                command.execute();
            }
        }
        else{
            System.out.println("negative");
            for (ICommand command: negativeCommands) {
                command.execute();
            }
        }
    }

    @Override
    public IControlledCommand.ControlTypeEnum getControlType() {
        return IControlledCommand.ControlTypeEnum.CONDITIONAL_IF;
    }

    @Override
    public void addPositiveCommand(ICommand command) {
        this.positiveCommands.add(command);
    }

    @Override
    public void addNegativeCommand(ICommand command) {
        this.negativeCommands.add(command);
    }
}
