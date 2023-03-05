/*
1
212
32123
4321234
32123         i=3    321  23
212            i=2   21    2
1              i=1    1
*/
import java.util.*;
class Pattern4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for(int i=1;i<=n-1;i++){
            if(i==1){
                System.out.print(1);
            }
            else{
                for(int j=1,m=i;j<=i;j++,m--){
                    System.out.print(m);
                }
                for(int k=1,l=2;k<=i-1;k++,l++){
                    System.out.print(l);
                }
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i--){
            if(i==1){
                System.out.print(1);
            }
            else{
                for(int j=1,m=i;j<=i;j++,m++){
                    System.out.print(m);
                }
                for(int k=1,l=2;k<=i-1;k++,l++){
                    System.out.print(l);
                }
            }
            System.out.println();
        }
    }
}