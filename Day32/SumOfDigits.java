//To print sum of digits of a number using recursion
import java.util.*;
class SumOfDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0)
        return 0;
        return n%10+sum(n/10);
    }
}
