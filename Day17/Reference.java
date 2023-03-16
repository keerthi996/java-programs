//passing reference means passing non-primitive data types
import java.util.Arrays;
class Reference{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        increment(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void increment(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}