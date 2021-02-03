package representations;

import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import commands.ICommand;

import java.util.*;

public class UnoFunction{
    private String functionName;
    private LinkedHashMap<String, Value> parameters;
    private ArrayList<ICommand> commandList;
    private Scope functionScope;
    private PrimitiveType returnType;
    private Value returnValue;

    public UnoFunction(String functionName, LinkedHashMap<String, Value> parameters, PrimitiveType returnType){
        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.commandList = new ArrayList<>();
        this.functionScope = new Scope(functionName+"-scope",null);
        this.returnValue = new Value(null, returnType);
        SymbolTableManager.getInstance().setCurrentScope(functionScope);
    }

    public Value getReturnValue(){
        return this.returnValue;
    }
    public String getFunctionName(){
        return this.functionName;
    }

    //Parameter Related

    public void initParameters(LinkedHashMap<String, Value> parameters){
        this.parameters = parameters;
        // Add the parameters to the function scope (local variables)
        for(int i = 0; i < this.parameters.size(); i++) {
            Value value = (Value) this.parameters.values().toArray()[i];
            this.functionScope.addVariable((String) this.parameters.keySet().toArray()[i], value);
        }
    }

    public void setParameters(ArrayList<Value> parameterValue){
        //Add errror checking if sobra or kulang yung parameters
        if(parameterValue.size() != this.parameters.size()){
            System.err.println("Mismatch number of parameter type");
        }
        //Reassign the parameters to locals scope so that they have not null values
        else{
            for(int i = 0; i < this.parameters.size(); i++) {
                Value value = (Value) this.parameters.values().toArray()[i];
                //Error checking of type mismatch is done when setting the value in the value function
                value.setValue(parameterValue.get(i).getValue());
                this.functionScope.reAssignVariable((String) this.parameters.keySet().toArray()[i], value);
            }


        }
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
