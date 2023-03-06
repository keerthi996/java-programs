//create and access three dimensional array
import java.util.*;
class ThreeD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][][] a=new int[3][2][2];
        System.out.println("Enter array elements:");
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array elements for row number"+(i+1));
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[j].length;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int x[][]:a){
            for(int y[]:x){
                for(int z:y){
                    System.out.print(z+" ");
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
}