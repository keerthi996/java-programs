/*
SANDGLASS STAR PATTERN
*********      i=1,s=0,*=9
 *******        i=2,s=1,*=7
  *****         i=3,s=2,*=5
   ***          i=4,s=3,*=3
    *           i=5,s=4,*=1
   ***          i=1,s=3,*=3
  *****         i=2,s=2,*=5
 *******        i=3,s=1,*=7
*********       i=4,s=0,*=9
*/
import java.util.*;
class Pattern5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1,l=1;i>0;i--,l++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*l+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}  