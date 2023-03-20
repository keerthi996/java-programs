//Three sum
import java.util.*;
class ThreeSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements u want to enter:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum u want:");
        int sum=sc.nextInt();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==sum){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
    }
}