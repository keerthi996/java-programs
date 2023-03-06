//Create and access one dimensional array
import java.util.*;
class OneD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int x:a){
            System.out.println(x);
        }
    }
}