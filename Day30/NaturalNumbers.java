//To print natural numbers using function
import java.util.*;
class NaturalNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Natural numbers below "+n+ " is:");
        print(n);
    }
    static void print(int n){
        if(n==0)
        return;
       System.out.println(n--);
       print(n);
    }
}