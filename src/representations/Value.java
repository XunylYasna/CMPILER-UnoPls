package representations;

import java.util.Stack;


public class Value {

    private Stack<Object> defaultValue; //this value will no longer change.
    private Object value;
    private PrimitiveType primitiveType = PrimitiveType.EWAN;
    private boolean finalFlag = false;


    public Value(Object value, PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
        this.value = value;
        if(this.primitiveType == PrimitiveType.EWAN){
            System.err.println("Invalid primitive type");
        }
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }


    /*
     * Marks this value as final if there is a final keyword
     */
    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void setValue(String value) {

    }


    private Object attemptTypeCast(String value) {
        switch(this.primitiveType) {
            case CHAR: return Character.valueOf(value.charAt(0));
            case BOOL: return Boolean.valueOf(value);
            case INT:
                String s = value;

                if(s.contains(".")) {
                    String[] split = s.split("[.]");
                    return Integer.valueOf(split[0]);
                } else {
                    return Integer.valueOf(value);
                }
            case FLOAT: return Double.valueOf(value);
            case STRING: return value;
            default: return null;
        }
    }

    public Object getValue() {
        return this.value;
    }

    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }

    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOL:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Double;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    /*
     * Utility function.
     * Attempts to add an empty variable based from keywords
     */
    public static Value createEmptyVariableFromKeywords(String primitiveTypeString) {

        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.EWAN;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            primitiveType = PrimitiveType.BOOL;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            primitiveType = PrimitiveType.CHAR;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, primitiveTypeString)) {
            primitiveType = PrimitiveType.FLOAT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            primitiveType = PrimitiveType.INT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            primitiveType = PrimitiveType.STRING;
        }

        Value value = new Value(null, primitiveType);

        return value;
    }
}
