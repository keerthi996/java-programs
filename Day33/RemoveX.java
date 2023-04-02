//to crete a new string without x
import java.util.*;
class RemoveX{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String str=sc.next();
      System.out.println(noX(str));
    }
    static String noX(String str) {
    if(str.length()==0){
        return "";
    }
    if(str.charAt(0)=='x'){
        return noX(str.substring(1));
    }
    return str.charAt(0)+noX(str.substring(1));
        
    }

}
        