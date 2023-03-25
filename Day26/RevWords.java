//Reverse words of a sentence
import java.util.*;
class RevWords{
    public static void main(String args[]){
        String s="I love programming";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        

    }
}