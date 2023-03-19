/*a1={1,2,3}
  a2={4,5,6}
  result=21
*/
import java.util.*;
class Sum{
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
        int sum=0;
        for(int i=0;i<n1;i++){
            sum=sum+a1[i];
        }
        
        for(int i=0;i<n2;i++){
            sum=sum+a2[i];
        }
        
        System.out.println("Sum is: "+sum);
    
    }
}