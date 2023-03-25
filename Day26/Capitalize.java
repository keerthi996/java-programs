//capitalize the first letter of each word 
import java.util.*;
class Capitalize{
    public static void main(String args[]){
        String s="I love programming";
        String[] arr=s.split(" ");
        
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            String str=String.valueOf(arr[i].charAt(0));
            arr[i]=arr[i].replaceFirst(str,str.toUpperCase());
            System.out.print(arr[i]+" ");
        }
    }
}