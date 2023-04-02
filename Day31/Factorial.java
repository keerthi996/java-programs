//program to find the factorial of a number using recursion
import java.util.*;
class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n<=0)
        return 1;
        return n*fact(n-1);
    }
}