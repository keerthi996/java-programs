//HCF of two given numbers
import java.util.*;
class HCF{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n=sc.nextInt();
        System.out.println("enter second number:");
        int m=sc.nextInt();
        int result=0;
        if(n<=m){
            for(int i=1;i<=n0;i++){
                if(n%i==0 && m%i==0){
                    result=i;
                }
            }
        }
        System.out.println("HCF of given numbers is:"+result);
    }
}