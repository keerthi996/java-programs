import java.util.*;
class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int digits=0;
        int temp=0;
        int last=0;
        int sum=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }
}