package Managers.symbolTable;

import java.util.HashMap;

public class SymbolTableManager {

    private HashMap<String, IScope> classTable = new HashMap<>();
    private static SymbolTableManager sharedInstance = null;


    //Implementation of singleton
    public static SymbolTableManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new SymbolTableManager();
        }

        return sharedInstance;
    }

    public void addClassScope(String className, ClassScope classScope){
        this.classTable.put(className, classScope);
    }

    public ClassScope getClassScope(String className){
        if(this.containsClassScope(className)){
            return (ClassScope) this.classTable.get(className);
        }
        else{
            System.out.println("Semantic error: " + className + " is not found.");
            return null;
        }
    }

    public boolean containsClassScope(String className){
        return this.classTable.containsKey(className);
    }

    public void resetSymbolTableManager(){
        sharedInstance = null;
        classTable = new HashMap<>();
    }
}
