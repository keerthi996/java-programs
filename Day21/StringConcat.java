//String.concat() method
import java.util.*;
class StringConcat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=" ";
        String s2=" ";
        System.out.println("Enter first string:");
        s1=sc.next();
        System.out.println("Enter second string:");
        s2=sc.next();
        System.out.println(s1.concat(s2));

    }
}