//to print fiirst n natural numbers using recursion;
import java.util.*;
class FirstNSum{
    static int sum(int n,int i){
        if(n>0){
            return i+sum(n-1,i+1);
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println(sum(n,1));

    }
}