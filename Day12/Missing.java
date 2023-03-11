//To find the missing number below the given number
import java.util.*;
class Missing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int sum_required=n*(n+1)/2;
        int actual_sum=0;
        for(int i=0;i<n-1;i++){
            actual_sum=actual_sum+a[i];
        }
        System.out.println("Missing number is:"+(sum_required-actual_sum));
    }
}