//Rotate array by one to right
import java.util.Arrays;
import java.util.*;
class RotateRight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=a[n-1];
        for(int i=n-2;i>=0;i--){
            a[i+1]=a[i];
        
        }
        a[0]=x;
        System.out.println(Arrays.toString(a));
    }
}