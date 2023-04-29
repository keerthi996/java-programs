//divide numbers from 1 to n of equal sum and equal numbers
import java.util.*;
class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*(n+1)/2;
        if(n%2==0 && s%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }

    }
}