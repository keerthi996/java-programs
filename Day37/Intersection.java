//Intersection of  two arrays
import java.util.*;
class Intersection{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements u want to enter in array1:");
        int n1=sc.nextInt();
        int[] a=new int[n1];
        System.out.println("Enter array1 elements:");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements u want to enter in array2:");
        int n2=sc.nextInt();
        int[] b=new int[n2];
        System.out.println("Enter array1 elements:");
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("common elements are:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }

    }
}
