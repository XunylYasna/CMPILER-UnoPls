package representations;

import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import commands.ICommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnoFunction{
    private String functionName;
    private HashMap<String, Value> parameters;
    private ArrayList<ICommand> commandList;
    private Scope functionScope;
    private PrimitiveType returnType = PrimitiveType.VOID;
    private Value returnValue = null;

    public UnoFunction(String functionName, HashMap<String, Value> parameters, PrimitiveType returnType){
        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.commandList = new ArrayList<>();
        this.functionScope = new Scope(functionName+"-scope",null);
        SymbolTableManager.getInstance().setCurrentScope(functionScope);
    }

    public Value getReturnValue(){
        return this.returnValue;
    }
    public String getFunctionName(){
        return this.functionName;
    }

    //Parameter Related

    public void initParameters(HashMap<String, Value> parameters){
        //Add error checking if type mismatch
        this.parameters = parameters;
    }

    public void setParameters(ArrayList<Value> parameterValue){
        //Add errror checking if sobra or kulang yung parameters
        if(parameterValue.size() != this.parameters.size()){
            System.err.println("Mismatch number of parameter type");
        }

        //Add the parameters to locals scope
//        for (Map.Entry<String,Value> variable: this.parameters.entrySet()) {
//            functionScope.addVariable(variable.getKey(), variable.getValue());
//        }
    }

    // Scope Related
    public Scope getFunctionScope(){
        return this.functionScope;
    }

    //Function Related
    public void addCommand(ICommand command){
        commandList.add(command);
    }

    public ArrayList<ICommand> getCommandList(){
        return this.commandList;
    }

}
