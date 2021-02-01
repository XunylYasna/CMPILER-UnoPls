package Managers.errors;

import java.util.ArrayList;

public class SemanticErrorManager {
    //Singleton class for tracking all Semantic Errors
    private static SemanticErrorManager sharedInstance = null;
    private static ArrayList<String> semanticErrors = new ArrayList<>();
    private static boolean errorFlag = false;


    //Implementation of singleton
    public static SemanticErrorManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new SemanticErrorManager();
        }
        return sharedInstance;
    }

    private SemanticErrorManager(){}

    public ArrayList<String> getSemanticErrors(){
        return this.semanticErrors;
    }

    public void addSemanticError(String errorMessage){
        errorFlag = true;
        semanticErrors.add(errorMessage);
        return;
    }

    public void resetSemanticErrorManager(){
        sharedInstance = null;
        semanticErrors = new ArrayList<>();
        errorFlag = false;
    }

    public boolean isErrorFlag(){
        return this.errorFlag;
    }
}
