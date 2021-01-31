package Managers.symbols;

import representations.UnoFunction;

import java.util.HashMap;

public class SymbolTableManager {

    private static Scope currentScope;
    private static UnoFunction currentFunction;

    private static HashMap<String, UnoFunction> functions;

    private static SymbolTableManager sharedInstance = null;


    //Implementation of singleton
    public static SymbolTableManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new SymbolTableManager();
            currentScope = new Scope("first", null);
            functions = new HashMap<>();
        }

        return sharedInstance;
    }

    public void resetSymbolTableManager(){
        sharedInstance = null;
        currentScope = null;
        functions = null;
    }
    //


    // Scope Managing
    public void setCurrentScope(Scope scope){
        this.currentScope = scope;
    }

    public Scope getCurrentScope() {
        return this.currentScope;
    }


    // Function Managing
    public UnoFunction getCurrentFunction(){
        return this.currentFunction;
    }

    public void setCurrentFunction(UnoFunction function){
        this.currentFunction = function;
    }

    public void addFunction(String functionName, UnoFunction function){
        this.functions.put(functionName, function);
    }

    public UnoFunction findFunction(String functionName){
        return this.functions.get(functionName);
    }

    public boolean doesFunctionExist(String functionName){
        return this.functions.containsKey(functionName);
    }

    public HashMap<String,UnoFunction> getFunctions(){
        return this.functions;
    }

}
