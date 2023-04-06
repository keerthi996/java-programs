//to print fiirst n natural numbers using recursion;
import java.util.*;
class FirstN{
    static int print(int n,int i){
        if(n>0){
            System.out.println(i);
            return print(n-1,i+1);
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,1);

    }
}