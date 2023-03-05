/*
* * * * *   i=1,s=0,*=5
 * * * *    i=2,s=1,*=4
  * * *     i=3,s=2,*=3
   * *      i=4,s=3,*=2
    *       i=5,s=4,*=1
*/
import java.util.*;
class Pattern8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}