//Chech whether two strings are equal using .equals() method
import java.util.*;
class IsEquals{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter first string:");
        s1=sc.next();
        System.out.println("Enter second string:");
        s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}