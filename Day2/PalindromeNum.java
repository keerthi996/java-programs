import java.util.*;
class PalindromeNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,reverse=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}