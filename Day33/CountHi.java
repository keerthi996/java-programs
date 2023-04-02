import java.util.*;
class CountHi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        System.out.println(countHi(str));
    }
    static int countHi(String str) {
    if(str.length()<2)
      return 0;
    if(str.substring(0,2).equals("hi"))
      return 1+countHi(str.substring(1));
    return countHi(str.substring(1));
    }
}
