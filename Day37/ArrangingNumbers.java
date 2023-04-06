/*Arrange even and odd numbers
take input from the user and print odd numbers before it and even numbers after that numbers
*/
import java.util.*;
import java.util.Arrays;
class ArrangingNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                a[k]=i;
                k++;
            }
        }
        if(n%2==1){
            a[k++]=n-1;
        }
        else{
            a[k++]=n-2;
        }
        for(int i=k,j=a[k-1]-2;i<a.length;i++,j=j-2,k++){
            a[k]=j;
            
        }
        System.out.println(Arrays.toString(a));

    }
}

