//program to count the total ears of bunnies, if the count of bunnies is odd each bunny has 2 ears, if even each bunny have 3 ears.
import java.util.*;
class BunnyEars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(ears(n));
    }
    static int ears(int n){
        if(n==0)
        return 0;
        if(n%2==0){
            return 3+ears(n-1);
        }
        
        return 2+ears(n-1);
     }
}
