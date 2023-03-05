/*
 * * * * *
  *     *
   *   *
    * *
     *
*/
import java.util.*;
class Pattern11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nnumber:");
        int n=sc.nextInt();
        for(int i=1,k=n+2;i<=n;i++,k-=2){
            if(i==1){
                for(int m=1;m<=n;m++){
                    System.out.print("* ");
                }
            }
            if(i>=2 && i<=n-1){
                for(int j=1;j<=i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int l=1;l<=k;l++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==n){
                for(int a=1;a<=n-1;a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}