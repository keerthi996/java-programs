//Program to perform insertion sort algorithm
import java.util.Arrays;
class Insertion{
    public static void main(String args[]){
        int[] a={7,5,3,9,10,11,3,4};
        int key,j;
        for(int i=1;i<a.length;i++){
            key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        System.out.println(Arrays.toString(a));

    }
}