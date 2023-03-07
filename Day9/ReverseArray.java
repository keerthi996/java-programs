//Reverse elements of an array
import java.util.*;
class ReverseArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int end=a.length-1;
        for(int i=0;i<n/2;i++){
            int temp=a[end];
            a[end]=a[i];
            a[i]=temp;
            end--;
        }
        System.out.println("Reverse of an array is:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        

    }
}