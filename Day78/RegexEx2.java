import java.util.regex.Pattern;
import java.util.regex.Matcher;
//dot represents a single character
public class RegexEx2 {
    public static void main(String[] args){
        //1st way
        Pattern p = Pattern.compile("a.s");//. represents single character
        Matcher m = p.matcher("ass");
        boolean b1 = m.matches();

        //2nd way
        boolean b2=Pattern.compile("a.s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b1+" "+b2+" "+b3);
    }
}
