import java.util.*;
class CountX{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String:");
      String str=sc.next();
      System.out.println(count(str));
    }
    static int count(String str) {
    int count=0;
    if(str.length()==0){
        return 0;
    }
    if(str.charAt(0)=='x'){
        count++;
        return count+count(str.substring(1));
    }
    return count(str.substring(1));
        
    }

}
        