/*
    *
   * *
  *   *
 *     *
* * * * * 
*/
import java.util.*;
class Pattern10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1,j=-1;i<=n;i++,j+=2){
            if(i==1){
                for(int a=1;a<=n-1;a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i>=2 && i<=n-1){
                for(int k=n-i;k>0;k--){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int l=1;l<=j;l++){
                    System.out.print(" ");
                }
                System.out.print("*");
            
            }
            if(i==n){
                for(int m=1;m<=n;m++){
                    System.out.print("* ");
                }
            }
            System.out.println();
            
        }
    }
}