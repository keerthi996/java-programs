//to find number of times 7 is repeated in a digit
import java.util.*;
class Count8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(count(n));
    }
    static int count(int n){
        if(n==0)
        return 0;
        if((n%10)==8)
        return 1+count(n/10);
        return count(n/10);
    }
}
