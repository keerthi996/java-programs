/*a1={1,2,3}
  a2={4,5,6}
  result={1,2,3,4,5,6}
*/
import java.util.Arrays;
import java.util.*;
class Merge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements u want to enter in array1:");
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter elements of array1:");
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements u want to enter in array2:");
        int n2=sc.nextInt();
        int[] a2=new int[n2];
        System.out.println("Enter elements of array2:");
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        int[] result=new int[n1+n2];
        for(int i=0;i<n1;i++){
            result[i]=a1[i];
        }
        for(int i=n1,j=0;i<n1+n2;i++,j++){
            result[i]=a2[j];
        }
        System.out.println("Merged array is: "+Arrays.toString(result));
    }
}
