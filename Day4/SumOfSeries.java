//sum of1-1/2+1/3-1/4+1/5.......1/n
import java.util.*;
class SumOfSeries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms u want:");
        int n=sc.nextInt();
        double sum=0.0;
        int sign=1;
        for( int i=1;i<=n;i++){
            sum+=((sign*1)/i);
            sign*=-1;
        }
        System.out.println("Sum of series is:"+sum);

    }
}