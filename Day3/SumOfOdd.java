import java.util.*;
class SumOfOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        int num=1;
        while(i<=n){
            sum=sum+num;
            i++;
            num+=2;
        }
        System.out.println("Sum of "+n+" odd numbers is:"+sum);
    }
}