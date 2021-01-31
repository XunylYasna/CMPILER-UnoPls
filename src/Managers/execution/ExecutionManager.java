package Managers.execution;

import commands.ICommand;

import java.util.ArrayList;

public class ExecutionManager {
    private static ExecutionManager sharedInstance = null;
    private static ArrayList<ICommand> executionList = new ArrayList<ICommand>();
    private boolean foundEntryPoint = false;

    //Implementation of singleton
    public static ExecutionManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new ExecutionManager();
        }

        return sharedInstance;
    }

    private ExecutionManager() {
    }

    public boolean hasFoundEntryPoint() {
        return foundEntryPoint;
    }

    public void reportEntryPoint() {
        foundEntryPoint = true;
        return;
    }

    public void resetExecutionManager(){
        sharedInstance = null;
        foundEntryPoint = false;
        executionList = new ArrayList<>();
    }
    
    public void addExecutionList(ICommand command){
        this.executionList.add(command);
    }
    
    public ArrayList<ICommand> getExecutionList(){
        return this.executionList;
    }

    public void execute(){
        for(ICommand command : executionList){
//            System.out.println(command);
            command.execute();
        }
    }
}
