/*Merge two sorted arrays
  a1={3,6,8}
  a2={2,4,5}
  res={2,3,4,5,6,8}
*/
import java.util.*;
import java.util.Arrays;
class SortedMerge{
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
        int[] c=new int[n1+n2];
        int k=0,j=0,i=0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                c[k]=a1[i];
                i++;
            }
            else{
                c[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            c[k++]=a1[i++];
        }
        while(j<n2){
            c[k++]=a2[j++];
        }
        System.out.println(Arrays.toString(c));
    }
}