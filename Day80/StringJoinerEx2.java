import java.util.StringJoiner;

public class StringJoinerEx2 {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner("@");

      
        sj.setEmptyValue("hi ..hello"); 

        System.out.println(sj);

    }    
}