package Managers.commandControl;

import Managers.symbols.SymbolTableManager;
import commands.ICommand;
import commands.controlled.IConditionalCommand;
import commands.controlled.IControlledCommand;

import java.util.ArrayList;
import java.util.Stack;

public class CommandControlManager {
    private static CommandControlManager sharedInstance = null;
    private static Stack<ICommand> commandList;
    private static ICommand currentCommand;
    private static boolean isInPositive = true; // For if statements place it in
    private static boolean isInControl = false;
    private static IControlledCommand.ControlTypeEnum controlType;
    private CommandControlManager(){

    }

    //Implementation of singleton
    public static CommandControlManager getInstance(){ // Call this when entering a controlled command
        if(sharedInstance == null){
            sharedInstance = new CommandControlManager();
            commandList = new Stack<>();
            isInPositive = true;
            isInControl = false;
            currentCommand = null;
            controlType = null;
        }

        return sharedInstance;
    }

    public void resetConditionalManager(){ //Call this when leaving a controlled command
        sharedInstance = null;
    }

    //Manager Related
    public boolean isControl(){
        return this.isInControl;
    }

    //Command Related
    public void initializeCommand(ICommand command, IControlledCommand.ControlTypeEnum controlType){
        // Initialize command is called every time the statement analyzer sees an if, ifelse statement
        // Add to the current function if it is the base if statement, else add it to the control
        if(!isInControl){
            System.out.println("Adding controlled command to function: " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(command);
        }
        else{
            System.out.println("Adding controlled command to parent controlled command");
            this.addCommand(command);
        }

        commandList.add(command);
        currentCommand = command;
        isInControl = true;
        isInPositive = true;
        this.controlType = controlType;
    }


    // Add command
    public void addCommand(ICommand command){
        // Add command should only be called when it is inside a control function
        // Add the command to the positive or negative part of the command
        if(this.controlType == IControlledCommand.ControlTypeEnum.CONDITIONAL_IF){
            if(isInPositive){
                System.err.println("Added to positive if");
                ((IConditionalCommand)currentCommand).addPositiveCommand(command);
            }
            else{
                System.err.println("Added to negative if");
                ((IConditionalCommand)currentCommand).addNegativeCommand(command);
            }
        }
        else{
            ((IControlledCommand)currentCommand).addCommand(command);
        }
//        if(this.controlType == IControlledCommand.ControlTypeEnum.WHILE_CONTROL){
//            ((IControlledCommand)currentCommand).addCommand(command);
//        }
    }

    public void exitedCommand(){
        System.out.println("Exited controlled command: " + this.controlType);
        if(commandList.isEmpty()){
            this.resetConditionalManager();
        }
        else{
            commandList.pop();
            if(!commandList.isEmpty()){
                currentCommand = commandList.peek();
                controlType = ((IControlledCommand)currentCommand).getControlType();
                isInControl = true;
            }
            else{
                isInControl = false;
            }
        }
    }

    public void enteredNegative(){
        isInPositive = false;
    }
}
