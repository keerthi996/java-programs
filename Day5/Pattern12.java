/*
        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *
*/
import java.util.*;
class Pattern12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=1,j=-1;i<=n;i++,j+=2){
            if(i==1){
                for(int a=1;a<=n-1;a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i>=2 && i<=n){
                for(int k=n-i;k>0;k--){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int l=1;l<=j;l++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=1,k=n;i<=n-1;i++,k-=2){
            System.out.print(" ");
            if(i>=1 && i<=n-2){
                for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int l=1;l<=k;l++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==n-1){
                for(int a=1;a<=n-2;a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}