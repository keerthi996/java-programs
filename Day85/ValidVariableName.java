import java.util.regex.*;
class ValidVariableName{
    public static void main(String[] args){
        String pattern = "^[a-zA-Z_][a-zA-Z0-9_]*$";
        String variableName="213keerthiii";
        if(Pattern.matches(pattern, variableName)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}