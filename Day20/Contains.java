//using contains() method which returns true if it contains that character otherwise it returns false
import java.util.*;
class Contains{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter  string:");
        s1=sc.next();
        System.out.println("Enter  string to check:");
        s2=sc.next();
        if(s1.contains(s2)){
            System.out.println("Yes it contains ");
        }
        else{
            System.out.println("No it does not contain");
        }
    }
}
