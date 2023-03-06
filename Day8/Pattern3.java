/*
    *     * * * *
    *     *
    *     *
    * * * * * * *
          *     *
          *     *
    * * * *     *
*/
import java.util.*;
class Pattern3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.print("*");
                for(int j=1;j<=n-2;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=n/2+1;k++){
                    System.out.print("* ");
                }
            }
            if(i==n/2+1){
                for(int l=1;l<=n;l++){
                    System.out.print("* ");
                }
            }
            if(i>=2 && i<=n/2) {
                System.out.print("*");
                for(int m=1;m<=n-2;m++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i>=n/2+2 && i<n){
                for(int q=1;q<=n-1;q++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int s=1;s<=n-2;s++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==n){
                for(int r=1;r<=n/2+1;r++){
                    System.out.print("* ");
                }
                for(int p=1;p<=n-3;p++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
