//Binary search is used to find the element in sorted array
import java.util.Arrays;
import java.util.*;
class BinarySearch{
    static int binary(int[] a,int l,int n,int x){
        if(n>=l){
            int mid=l+(n-1)/2;
            if(a[mid]==x){
                return mid;
            }
            if(a[mid]>x){
                return binary(a,1,mid-1,x);
            }
            else{
                return binary(a,mid+1,n,x);
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the element u want to search");
        int x=sc.nextInt();
        int res=binary(a,0,n-1,x);
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            
            System.out.println("Element is found at:"+res);
        }
    }
}