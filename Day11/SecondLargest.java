//find the second largest
import java.util.Arrays;
import java.util.Scanner;
class SecondLargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        int max=0;
        for(int k=0;k<2;k++){
                max=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(arr[i]>max){
                        max=arr[i];
                        index=i;
                    }
                }
                int x=arr[index];
                for(int j=0;j<n;j++){
                    if(arr[j]==x){
                        arr[j]=0;
                    }
                }
            
            }
            System.out.println(max);
    }
}