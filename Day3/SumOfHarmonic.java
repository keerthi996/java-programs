import java.util.*;
class SumOfHarmonic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        double sum=0.0;
        int i=1;
        double num=0.0;
        while(i<=n){
            num=1/(double)i;
            sum=sum+num;
            i++;
        }
        System.out.println("sum of first "+n+" terms of harmonic series is:"+sum);
    }
}