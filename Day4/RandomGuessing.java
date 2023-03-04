//random number guessing
import java.util.*;
class RandomGuessing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=23;
        int x;
        do{
            System.out.println("Enter number:");
            x=sc.nextInt();
            if(x<n){
                System.out.println("Too low");
            }
            if(x>n){
                System.out.println("Too high");
            }
            System.out.println("try again!");

        }
        while(x!=n);
        System.out.println("You reached");
    }
}