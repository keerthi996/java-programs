//LEADER ELEMENT is the element whose right side elements are less than that element
import java.util.Arrays;
import java.util.Scanner;
class Leader{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]>arr[i]){
                    count++;
                    break;
                }
            
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        
        }
    }
}