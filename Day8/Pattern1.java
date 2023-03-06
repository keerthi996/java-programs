/*
1 2 3 4 5
1 2 3 4 *
1 2 3 * * *
1 2 * * * * *
1 * * * * * * *
*/
import java.util.*;
class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=0,m=-1;i<=n;i++,m+=2){
            if(i==0){
                for(int j=1;j<=n;j++){
                    System.out.print(j+" ");
                }
            }
            if(i>=1 && i<n){
                for(int k=1;k<=n-i;k++){
                    System.out.print(k+" ");
                }
                for(int l=1;l<=m;l++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}