package Managers.symbols;

import Managers.errors.SemanticErrorManager;
import representations.Value;

import java.util.HashMap;

public class Scope {
    private String id;
    private Scope parentScope;
    private HashMap<String, Value> localVariables = null;

    public Scope(String id, Scope parentScope){
        this.id = id;
        this.parentScope = parentScope;
        this.localVariables = new HashMap<>();
    }

    // For child scopes
    public Scope(Scope parentScope){
        int levelcount = 0;
        String parentName = parentScope.getId();
        Scope scope = parentScope;

        while (scope.getParentScope() != null){
            System.out.println(scope.getId());
            levelcount += 1;
            parentName = parentScope.getId();
            scope = parentScope;
        }
        this.id = parentName + " - level:" + levelcount;
        this.parentScope = parentScope;
        this.localVariables = new HashMap<>();
    }

    public Scope getParentScope(){
        return this.parentScope;
    }

    // Variables (add, find, contains)
    public void addVariable(String identifier, Value value){
        // TODO
        //type mismatch
        this.localVariables.put(identifier,value);
    }

    public void reAssignVariable(String identifier, Value value){
        // TODO
        // Check for errors (undeclared variable, variable out of scope, type mismatch
        System.out.println("Reassigning variable " + identifier + " to " + value.getValue());
        this.localVariables.replace(identifier,value);
    }

    public HashMap<String,Value> getLocalVariables(){
        return this.localVariables;
    }

    public Value findVariableValueAllScopes(String identifier){
        if(containsVariableLocally(identifier)){
            return this.localVariables.get(identifier);
        }
        else{
            Scope tempScope = parentScope;
            while (tempScope != null){
                if(tempScope.containsVariableLocally(identifier)){
                    return tempScope.getLocalVariables().get(identifier);
                }
                tempScope = tempScope.parentScope;
            }
        }
        return null;
    }

    public boolean containsVariableLocally(String identifier){
        return localVariables.containsKey(identifier);
    }

    public boolean containsVariableAllScopes(String identifier){
        if(containsVariableLocally(identifier)){
            return true;
        }
        else{
            Scope tempScope = parentScope;
            while (tempScope != null){
                if(tempScope.containsVariableLocally(identifier)){
                    return true;
                }
                tempScope = tempScope.parentScope;
            }
        }
        return false;
    }

    public String getId() {
        return id;
    }
}
