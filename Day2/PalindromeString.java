import java.util.*;
class PalindromeString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        String rev="";
        String original=s;
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("Given String is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}