package commands.controlled;

import commands.ICommand;

public interface IConditionalCommand extends ICommand {

    public abstract IControlledCommand.ControlTypeEnum getControlType();
    public abstract void addPositiveCommand(ICommand command);
    public abstract void addNegativeCommand(ICommand command);
}
