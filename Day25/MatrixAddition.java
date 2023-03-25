//Addition of two matrices
import java.util.Arrays;
class MatrixAddition{
    public static void main(String args[]){
        int[][] a1={
            {2,3},{4,5}
        };
        int[][] a2={
            {6,7},
            {8,9}
        };
        int[][] c=new int[a1.length][a1.length];
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1.length;j++){
                c[i][j]=a1[i][j]+a2[i][j];
            }
        }
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}