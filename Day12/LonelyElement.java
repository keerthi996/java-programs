//Lonely Element
import java.util.*;
class LonelyElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result=a[0];
        for(int i=1;i<n;i++){
            result=result^a[i];
        }
        System.out.println(result);
    }
}