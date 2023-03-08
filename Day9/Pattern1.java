/*
* * * * *
1*     *
22*   *
333* *
4444*
*/
import java.util.*;
class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=0,m=n*2-3;i<n;i++,m-=2){
            if(i==0){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }
            if(i>=1){
                for(int j=0;j<i;j++){
                    System.out.print(i);
                }
                System.out.print("*");
                for(int k=1;k<=m;k++){
                    System.out.print(" ");
                    
                }
                if(i<n-1){
                    System.out.print("*");
                }
                
            }
            System.out.println();
            
        }
    }
}