//package Managers.symbols;
//
//import Managers.errors.SemanticErrorManager;
//import representations.Value;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class LocalScope {
//    private String id;
//    private IScope parentScope;
//    private ArrayList<LocalScope> childScopeList = null;
//    private HashMap<String, Value> localVariables = null;
//    SemanticErrorManager semanticErrorManager;
//
//    public LocalScope(IScope parentScope){
//        childScopeList = new ArrayList<>();
//        localVariables = new HashMap<>();
//        this.parentScope = parentScope;
//    }
//
//    public boolean addVariable(String id, Value value){
//        if(containsVariable(id)){
//            System.err.println("Variable is already declared in the local scope");
//            semanticErrorManager.getInstance().addSemanticError("Semantic Error:" + " Variable '" + id + "' is already declared in the local scope");
//            return false;
//        }
//        else{
//            localVariables.put(id,value);
//            System.out.println("Added variable: " + value.getPrimitiveType().getToken() + " " + id + " " + value.getValue().toString());
//            return true;
//        }
//    }
//
//    public Value getLocalVariable(String id){
//        return localVariables.get(id);
//    }
//
//    public boolean containsVariable(String identifier){
//        if(this.localVariables != null && this.localVariables.containsKey(identifier)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public IScope getParentScope(){
//        return this.parentScope;
//    }
//
//    public ArrayList<LocalScope> getChildrenScope(){
//        return childScopeList;
//    }
//
//    public Value searchAllScope(String identifier){
//        // search all parent until a class scope is found
//        IScope currentScope = parentScope;
//        while (!(currentScope instanceof ClassScope)){
//            if(((LocalScope)currentScope).containsVariable(identifier)){
//                return ((LocalScope) currentScope).getLocalVariable(identifier);
//            }
//            currentScope = ((LocalScope)currentScope).getParentScope();
//        }
//        return ((ClassScope) currentScope).getVariable(identifier);
//    }
//}
