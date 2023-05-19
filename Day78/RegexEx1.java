import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexEx1 {
    public static void main(String[] args){
        Pattern p=Pattern.compile(".....");
        Matcher m=p.matcher("Hello");
        if(m.matches()){
            System.out.println("Yes..u got it");
        }
        else{
            System.out.println("NO..try again");
        }
    }
}
