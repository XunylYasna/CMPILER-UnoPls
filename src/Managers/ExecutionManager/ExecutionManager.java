package Managers.ExecutionManager;

import commands.ICommand;

import java.util.ArrayList;

public class ExecutionManager {
    private static ExecutionManager sharedInstance = null;
    private ArrayList<ICommand> executionList = new ArrayList<ICommand>();


    //Implementation of singleton
    public static ExecutionManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new ExecutionManager();
        }

        return sharedInstance;
    }
    private ExecutionManager() {
    }

    public static void initialize() {
        sharedInstance = new ExecutionManager();
    }
}
