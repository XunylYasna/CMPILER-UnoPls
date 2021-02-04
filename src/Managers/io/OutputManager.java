package Managers.io;

import ide.inputForm.InputDialog;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.util.ArrayList;

public class OutputManager {

    //Singleton
    private static OutputManager sharedInstance = null;
    private static ArrayList<String> outputLogs;
    private static TextFlow console;

    public static OutputManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new OutputManager();
        }

        return sharedInstance;
    }

    public void setConsole(TextFlow console){
        this.console = console;
    }

    private OutputManager(){

    }

    public String getInput(String message){

        ide.inputForm.InputDialog dialog = new InputDialog();
        dialog.setTitle("UnoPls - Scan Function");
        dialog.setTextField(message);
        dialog.pack();
        dialog.setVisible(true);

        String result = dialog.getResult();
        return result;
    }

    public void addRunTimeError(String log){
        Text logText = new Text(log.replaceAll("_LINEBREAK_", "\n"));
        console.getChildren().add(logText);
        console.getChildren().add(new Text(System.lineSeparator()));
    }

    public void addoutputLog(String log){
        this.outputLogs.add(log);
        Text logText = new Text(log.replaceAll("_LINEBREAK_", "\n"));
        console.getChildren().add(logText);
        console.getChildren().add(new Text(System.lineSeparator()));
    }

    public void resetOutputManager(){
        sharedInstance = null;
        outputLogs = new ArrayList<>();
        console.getChildren().clear();
    }

    public ArrayList<String> getOutputLogs(){
        return this.outputLogs;
    }

}
