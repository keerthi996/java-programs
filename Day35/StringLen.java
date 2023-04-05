//To find length of the string using recursion
import java.util.*;
class StringLen{
    static int length(String s){
        if(!s.isEmpty()){
            return 1+length(s.substring(1));
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.next();
        System.out.println("Length of the string is:"+length(s));
    }
}