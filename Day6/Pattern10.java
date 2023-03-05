/*
A
BB
CCC
DDDD
EEEEE
*/
import java.util.*;
class Pattern10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int start=65;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print((char)(start+i));
            }
            System.out.println();
        }
    }
}