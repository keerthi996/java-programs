//Finding the kth largest/smallest element in Given array
import java.util.Arrays;
import java.util.*;
class KthElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of arry elemnts:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter value for k:");
        int k=sc.nextInt();
        System.out.println(k+" th largest element is:"+arr[n-k]);
        System.out.println(k+" th smallest element is:"+arr[k-1]);
    }
}