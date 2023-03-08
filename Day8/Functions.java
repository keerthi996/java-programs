//Using functions
import java.util.*;
class Functions{
    static int sum(int a,int b){
       int sum=a+b;
       return sum;
    }
    static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Multiplication of two numbers is:"+mul(a,b));
        System.out.println("addition of two numbers is:"+sum(a,b));
    }
}