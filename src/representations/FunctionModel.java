//package representations;
//
//import commands.ICommand;
//import commands.controlled.IControlledCommand;
//import analyzer.LocalScope;
//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//
//public class FunctionModel implements IControlledCommand {
//
//    public enum MethodType {
//        BOOL_TYPE,
//        INT_TYPE,
//        DECIMAL_TYPE,
//        STRING_TYPE,
//        CHAR_TYPE,
//        VOID_TYPE
//    }
//
//    private String functionName;
//    private List<ICommand> commandSequences; //the list of commands execution by the function
//    private LocalScope parentLocalScope; //refers to the parent local scope of this function.
////    private LinkedHashMap<String, ClassScope> parameterReferences; //the list of parameters accepted that follows the 'call-by-reference' standard.
//
//    private LinkedHashMap<String, Value> parameterValues;	//the list of parameters accepted that follows the 'call-by-value' standard.
//    private Value returnValue;
//    private MethodType returnType = MethodType.VOID_TYPE; //the return type of the function
//
//
//    public FunctionModel(){
//        this.commandSequences = new ArrayList<ICommand>();
//        this.parameterValues = new LinkedHashMap<String, Value>();
////        private LinkedHashMap<String, ClassScope> parameterReferences; //the list of parameters accepted that follows the 'call-by-reference' standard.
//    }
//
//    public void setParentLocalScope(LocalScope localScope) {
//        this.parentLocalScope = localScope;
//    }
//
//    public LocalScope getParentLocalScope() {
//        return this.parentLocalScope;
//    }
//
//    public void setReturnType(MethodType methodType) {
//        this.returnType = methodType;
//
//        //create an empty mobi value as a return value
//        switch(this.returnType) {
//            case BOOL_TYPE: this.returnValue = new Value(true, Value.PrimitiveType.BOOL); setValidReturns(false); break;
//            case INT_TYPE: this.returnValue = new BaracoValue(0, Value.PrimitiveType.INT); setValidReturns(false); break;
//            case DECIMAL_TYPE: this.returnValue = new BaracoValue(0.0, Value.PrimitiveType.FLOAT); setValidReturns(false); break;
//            case STRING_TYPE: this.returnValue = new BaracoValue("", Value.PrimitiveType.STRING); setValidReturns(false); break;
//            case CHAR_TYPE: this.returnValue = new BaracoValue(0, Value.PrimitiveType.CHAR); setValidReturns(false); break;
//            default:
//                break;
//        }
//    }
//
//    public boolean hasValidReturns(){
//        return this.hasValidReturns;
//    }
//
//    public void setValidReturns(boolean b) {
//        hasValidReturns = b;
//    }
//
//    @Override
//    public ControlTypeEnum getControlType() {
//        return null;
//    }
//
//    @Override
//    public void addCommand(ICommand command) {
//
//    }
//
//    @Override
//    public void execute() {
//
//    }
//}
