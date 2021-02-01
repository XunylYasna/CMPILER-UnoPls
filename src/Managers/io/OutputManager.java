package Managers.io;

import java.util.ArrayList;

public class OutputManager {

    //Singleton
    private static OutputManager sharedInstance = null;
    private static ArrayList<String> outputLogs;

    public static OutputManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new OutputManager();
        }

        return sharedInstance;
    }

    private OutputManager(){

    }

    public void addoutputLog(String log){
        this.outputLogs.add(log);
    }

    public void resetOutputManager(){
        sharedInstance = null;
        outputLogs = new ArrayList<>();
    }

    public ArrayList<String> getOutputLogs(){
        return this.outputLogs;
    }

}
