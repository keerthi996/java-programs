//perform addition operation until the user wants
import java.util.*;
class PerformAdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1;
        int n2;
        int sum=0;
        int n;
        boolean flag=true;
        char ch;
        do{
        
            if(flag){
                System.out.println("Enter first number");
                n1=sc.nextInt();
                System.out.println("Enter second number");
                n2=sc.nextInt();
                sum=n1+n2;
                flag=false;
                
            }
            else{
                System.out.println("Enter number:");
                n=sc.nextInt();
                sum=sum+n;
            }
            
            System.out.println("sum is:"+sum);
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);            
        }
        while(ch=='y'||ch=='Y');
    }
}