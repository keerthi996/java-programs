//Find the word with maximum length
import java.util.*;
class MaxLength{
    public static void main(String args[]){
        String s="I love programming";
        String[] arr=s.split(" ");
        int max=0;
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            if(max<arr[i].length()){
                max=arr[i].length();
            }
        }
        System.out.println(max);
        

    }
}