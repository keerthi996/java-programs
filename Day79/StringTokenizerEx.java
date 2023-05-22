//StringTokenizer class in Java is used to break a string into tokens.
import java.util.*;
class StringTokenizerEx{
    public static void main(String[] args){
        StringTokenizer st=new StringTokenizer("hello java"," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}