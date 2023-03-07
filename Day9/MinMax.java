//Print maximum and minimum element of an array
import java.util.*;
class MinMax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++){
        
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum element is:"+max);
        System.out.println("Minimum element is:"+min);
    }
}