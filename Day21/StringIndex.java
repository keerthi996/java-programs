//to find indexof certain character using indexOf() function
import java.util.*;
class StringIndex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=" ";
        System.out.println("Enter first string:");
        s1=sc.next();
        System.out.println("Enter character:");
        char ch=sc.next().charAt(0);
        System.out.println(s1.indexOf(ch));
    }
}