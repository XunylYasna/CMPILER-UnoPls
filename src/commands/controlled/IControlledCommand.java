package commands.controlled;

import commands.ICommand;

public interface IControlledCommand extends ICommand {
    public enum ControlTypeEnum {
        CONDITIONAL_IF,
        DO_WHILE_CONTROL,
        FOR_CONTROL,
        FOR_UP_TO_CONTROL,
        FUNCTION_TYPE,
        TRY_COMMAND,
        WHILE_CONTROL
    }

    public abstract ControlTypeEnum getControlType();
    public abstract void addCommand(ICommand command);
}