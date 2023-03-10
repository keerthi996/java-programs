//Move all zeroes to the end of the array
import java.util.Arrays;
import java.util.Scanner;
class MovingZeroes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                for(int j=1;j<i;j++){
                    if(arr[j]==0){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}