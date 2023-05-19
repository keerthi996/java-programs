import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx3 {
    public static void main(String[] args){
        //[abc] takes a or b or c
        Pattern p=Pattern.compile("[abc]");
        Matcher m=p.matcher("a");
        System.out.println(m.matches());
        //[^abc] takes except a,b,c
        Pattern p1=Pattern.compile("[^xyz]");
        Matcher m1=p1.matcher("x");
        System.out.println(m1.matches());
        //[a-zA-Z] takes input from a-z and A-Z
        Pattern p2=Pattern.compile("[a-cP-S]");
        Matcher m2=p2.matcher("x");
        System.out.println(m2.matches());


    }
}
