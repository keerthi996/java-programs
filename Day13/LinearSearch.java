//Linear search is used to search the element
import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element u want to search");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("Element"+x+" found at index "+i);
                break;
            }
        }
    }
}