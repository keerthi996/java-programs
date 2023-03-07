/*
3       3          5 rows = 6 spaces   5*2-4
3 2   2 3          7 rows = 10 spaces  7*2-4
3 2 1 2 3          9 rows = 14 spaces  9*2-4
3 2   2 3          11 rows=  18 spaces 11*2-4
3       3
*/
import java.util.*;
class Pattern4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int m=n/2;
        for(int i=1,z=n*2-4;i<=m+1;i++,z-=4){
            int c=(m+1)-(i-1);
            if(i==m+1){
                for(int j=m+1;j>0;j--){
                    System.out.print(j+" ");
                }
                for(int k=2;k<=m+1;k++){
                    System.out.print(k+" ");
                }
            }
            if(i==1){
                System.out.print((m+1)+" ");
                for(int l=1;l<=n*2-4;l++){
                    System.out.print(" ");
                }
                System.out.print((m+1)+" ");
            }
            if(i>=2 && i<=m){
                for(int x=1,p=m+1;x<=i;x++,p--){
                    System.out.print(p+" ");
                }
                for(int y=1;y<=z;y++){
                    System.out.print(" ");
                }
                for(int x=1,p=c;x<=i;x++,p++){
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
        for(int i=1,l=2;i<=m;i++,l+=4){
            int x=i+1;
            if(i>=1 && i<=m-1){
                for(int j=1,k=m+1;j<=(m+1)-i;j++,k--){
                System.out.print(k+" ");
            }
            for(int j=1;j<=l;j++){
                System.out.print(" ");
            }
            for(int p=1,q=x;p<=(m+1)-i;p++,q++){
                System.out.print(q+" ");
            }
            }
            if(i==m){
                System.out.print((m+1)+" ");
                for(int y=1;y<=n*2-4;y++){
                    System.out.print(" ");
                }
                System.out.print((m+1)+" ");
            }
            System.out.println();
        }
    }
}