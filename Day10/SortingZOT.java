//counting number of zeroes ones and twos
import java.util.Arrays;
import java.util.*;
class SortingZOT{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int zeroes=0,ones=0,twos=0;
        System.out.println("Enter number of arry elemnts:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int i=zeroes;i<zeroes+ones;i++){
            arr[i]=1;
        }
        for(int i=zeroes+ones;i<n;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}