/*
       A
      B B
     C   C
    D     D 
   F       F
    D     D
     C   C
      B B
       A
*/
import java.util.*;
class Pattern11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int start=65;
        for(int i=1,m=-1;i<=n;i++,m+=2){
            if(i==1){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.print((char)start);
            }
            if(i>=2 && i<=n){
                for(int k=1;k<=n-i;k++){
                    System.out.print(" ");
                }
                System.out.print((char)(start+(i-1)));
                for(int l=1;l<=m;l++){
                    System.out.print(" ");
                }
                System.out.print((char)(start+(i-1)));
            }
            System.out.println();
        }
        for(int i=n-1,m=n;i>0;i--,m-=2){
            if(i==1){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                System.out.print((char)start);
            }
            if(i>=2 && i<=n-1){
                for(int k=1;k<=n-i;k++){
                    System.out.print(" ");
                }
                System.out.print((char)(start+(n-i)));
                for(int l=1;l<=m;l++){
                    System.out.print(" ");
                }
                System.out.print((char)(start+(n-i)));
            }
            System.out.println();
        }
    }
}