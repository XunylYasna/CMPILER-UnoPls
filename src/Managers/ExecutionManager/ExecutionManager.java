package Managers.ExecutionManager;

import commands.ICommand;

import java.util.ArrayList;

public class ExecutionManager {
    private static ExecutionManager sharedInstance = null;
    private ArrayList<ICommand> executionList = new ArrayList<ICommand>();
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
}
