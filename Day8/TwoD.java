//Create and access two dimensional array
import java.util.*;
class TwoD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("Enter array elements:");
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array elements for row number "+(i+1));
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for(int x[]:a){
            for(int y:x){
                System.out.print(y +" ");
            }
            System.out.println();
        }
    }
}