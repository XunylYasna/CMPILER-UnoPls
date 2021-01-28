package Managers.symbolTable;

import representations.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalScope {
    private IScope parentScope;
    private ArrayList<LocalScope> childScopeList = null;
    private HashMap<String, Value> localVariables = null;

    public boolean containsVariable(String identifier){
        if(this.localVariables != null && this.localVariables.containsKey(identifier)){
            return true;
        }
        else{
            return false;
        }
    }
}
