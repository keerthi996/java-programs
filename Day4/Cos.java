//sin x=1-x3/3!+x5/51-......+xn/n1
import java.util.*;
class Cos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter degrees:");
        int x=sc.nextInt();
        int n=5;
        
        double x1=x*(3.142/180.0);
        int sign=1;
        double res=0;
        
        for(int i=0,j=0;i<n;i++,j+=2){
            res+=(sign*(double)Math.pow(x1,j))/fact(j);
            sign*=-1;
        }
        System.out.println(Math.round(res));
    }
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}