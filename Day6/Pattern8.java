/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5 
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
*/
import java.util.*;
class Pattern8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1,k=i+1;j<=n-i;j++,k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1,k=n-i;j<=i+1;j++,k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}