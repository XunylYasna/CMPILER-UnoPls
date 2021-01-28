package commands;

public interface IControlledCommand extends ICommand{
    public enum ControlTypeEnum {
        CONDITIONAL_IF,
        DO_WHILE_CONTROL,
        WHILE_CONTROL,
        FOR_CONTROL,
        FUNCTION_TYPE,
        TRY_COMMAND
    }

    public abstract ControlTypeEnum getControlType();
    public abstract void addCommand(ICommand command);
}