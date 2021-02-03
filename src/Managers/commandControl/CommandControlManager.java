package Managers.commandControl;

import commands.ICommand;
import commands.controlled.IConditionalCommand;
import commands.controlled.IControlledCommand;

import java.util.ArrayList;
import java.util.Stack;

public class CommandControlManager {
    private static CommandControlManager sharedInstance = null;
//    private static IControlledCommand.ControlTypeEnum controlTypeEnum = null;
    private static Stack<ICommand> commandList;
    private static ICommand currentCommand;
    private static boolean isInPositive = true; // For if statements place it in
    private static boolean isInControl = false;

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
    public void initializeCommand(IControlledCommand command, IControlledCommand.ControlTypeEnum controlType){
        currentCommand = command;
        commandList.push(command);
        this.isInControl = true;
    }


    // Add command
    public void addCommand(ICommand command, Boolean isControl){
        // Add the command to the positive or negative part of the command
        if(isInPositive){
            System.err.println("Added to positive if");
            ((IConditionalCommand)currentCommand).addPositiveCommand(command);
        }
        else{
            System.err.println("Added to negative if");
            ((IConditionalCommand)currentCommand).addNegativeCommand(command);
        }

        //if yung bagong command is another control na if statement add it to the stack
        if(isControl){
            currentCommand = (IControlledCommand)command;
            isInControl = true;
            isInPositive = true;
            commandList.push((IControlledCommand)currentCommand);
        }
    }

    public void exitedCommand(){
        System.out.println("exited controlled command");
        if(commandList.isEmpty()){
            this.resetConditionalManager();
        }
        else{
            currentCommand = commandList.pop();
            isInPositive = false;
            isInControl = true;
        }
    }

    public void enteredNegative(){
        isInPositive = false;
    }

//    public void enteredControlledCommand(){
//        this.isInControl = true;
//    }
}
