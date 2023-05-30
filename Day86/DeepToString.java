// converting multidimensional arrays to strings.
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        System.out.println(Arrays.toString(arr));

        int arr1[][] = {
                        {1,2,3},
                        {4,5,6},
                        {3,6,9}
                      };
       

        System.out.println(Arrays.deepToString(arr1)); 
    }    
}