//program to print reverse of a number that is given by the user
import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int rem=0;
        int res=0;
        while(n!=0){
            rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        System.out.println(res);
    }
}