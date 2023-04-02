//To print fibonacciSeries using recursion
import java.util.*;
class fibonacciSeries{
    static int n1=0,n2=1,n3=0;
    static int fibo(int n){
        if(n>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            fibo(n-1);   
        }  
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0) {
            System.out.print(n1+" "+n2);
            fibo(n-2);  
        }
    }
}