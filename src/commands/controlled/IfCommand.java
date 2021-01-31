package commands.controlled;

import antlr.UnoPlsParser;
import commands.ICommand;

import java.util.*;

public class IfCommand implements IControlledCommand {

    private ArrayList<ICommand> positiveCommands; //list of commands to execute if the condition holds true
    private ArrayList<ICommand> negativeCommands; //list of commands to execute if the condition holds false

    private UnoPlsParser.ExpressionContext conditionalExpression;

    public IfCommand(UnoPlsParser.ExpressionContext conditionalExpression) {

    }


    @Override
    public ControlTypeEnum getControlType() {
        return null;
    }

    @Override
    public void addCommand(ICommand command) {

    }

    @Override
    public void execute() {

    }
}
