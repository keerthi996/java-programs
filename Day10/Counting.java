//Counting number of occureneces of an element in array
import java.util.Arrays;
import java.util.*;
class Counting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int freq=0;
        System.out.println("Enter number of arry elemnts:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                freq++;
            }
            if(arr[i]>x)
               break;
        }
        System.out.println(freq);

    }
}