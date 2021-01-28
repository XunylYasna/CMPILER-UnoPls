package representations;

public class RecognizedKeywords {

    public static String CLASS_MODIFIER_PRIVATE = "private";
    public static String CLASS_MODIFIER_PUBLIC = "public";

    public static String PRIMITIVE_TYPE_BOOLEAN = "bool";
    public static String PRIMITIVE_TYPE_INT = "int";
    public static String PRIMITIVE_TYPE_CHAR = "char";
    public static String PRIMITIVE_TYPE_DECIMAL = "decimal";
    public static String PRIMITIVE_TYPE_STRING = "string";

    public static String BOOLEAN_TRUE = "true";
    public static String BOOLEAN_FALSE = "false";


    /*
     * Returns true if the keywords match. This is case-sensitive
     */
    public static boolean matchesKeyword(String keyword, String textToMatch) {
        if(textToMatch.contains(keyword)) {
            return true;
        }
        else {
            return false;
        }
    }
}
