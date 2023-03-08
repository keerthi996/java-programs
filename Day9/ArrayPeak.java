//Print peak element(whose neighbour elements are less) of an array
import java.util.*;
class ArrayPeak{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[0]>a[1]){
                System.out.println(a[0]);
            }
            if(a[n-1]>a[n-2]){
                System.out.println(a[n-1]);
            }
            if((a[i]>a[i-1])&&(a[i]>a[i+1])){
                System.out.println(a[i]);
            }
        }
    }
}