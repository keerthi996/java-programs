//To find the factorial of a number using recursion
import java.util.*;
class Factorial{
    static int fact(int n){
        int res=0;
        if(n==0){
            return 1;
        }
        res=n*fact(n-1);
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Factorial of given number is:"+fact(n));



    }
}