//two numbers are taken input from the user 
//write program to get first number raised to the power of second without built in function
import java.util.*;
class Power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int m=sc.nextInt();
        System.out.println("Enter second number");
        int n=sc.nextInt();
        int pow=1;
        for(int i=0;i<n;i++){
            pow*=m;
        }
        System.out.println(pow);
    }
}