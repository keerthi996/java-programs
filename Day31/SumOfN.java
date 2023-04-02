//Printing sum of first n natural numbers using recursion
import java.util.*;
class SumOfN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println(" sum of "+n+ " Natural numbers  is:");
    
        int sum= sum(n);
        System.out.println(sum);
    }
    static int sum(int n){
        if(n==1)
        return 1;
        int  sum=n+sum(n-1);
        return sum;
    }
}
