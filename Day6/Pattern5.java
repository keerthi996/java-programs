/*
5
54
543
5432
54321
*/
import java.util.*;
class Pattern5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=1,k=5;j<=n-i;j++,k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}