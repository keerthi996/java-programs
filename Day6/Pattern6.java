/* BINARY NUMBER PATTERN
   10101
   01010
   10101
   01010
   10101
*/
import java.util.*;
class Pattern6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2!=0 && j%2!=0)||(i%2==0 && j%2==0)){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
}