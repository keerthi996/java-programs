//to find length of a number using recursion
import java.util.*;
class NumLength{
    static int countDigits(int n){
        if(n%10!=0){
            return 1+countDigits(n/10);
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("number of digits:"+countDigits(n));

    }
}