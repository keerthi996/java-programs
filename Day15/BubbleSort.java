//Bubble sort
/* { 4,3,8,1,6}
    { 3,4,8,1,6}
    { 3,4,8,1,6}
    { 3,4,1,8,6}
    { 3,4,1,6,8}
    { 3,4,1,6,8}
    { 3,1,4,6,8}
    { 3,1,4,6,8}
    { 3,1,4,6,8}
    { 1,3,4,6,8}
*/
import java.util.Arrays;
import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of array elements u want to enter:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Please enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}