//charAt(int index) method in string
import java.util.*;
class CharAt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter string:");
        s=sc.next();
        System.out.println("Enter index:");
        int n=sc.nextInt();
        System.out.println("Character at index "+n+" is "+s.charAt(n));
    }
}