//Geometric progression ----nth term=ar power(n-1)
import java.util.*;
import java.util.Arrays;
import java.lang.Math;
class Geometric{
    static int geo(int t1,int n,int d){
        int res=t1*(int)Math.pow(d,n-1);
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first term:");
        int t1=sc.nextInt();
        System.out.println("Enter common difference:");
        int d=sc.nextInt();
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=geo(t1,i+1,d);
        }
        System.out.println(Arrays.toString(arr));
    }
}