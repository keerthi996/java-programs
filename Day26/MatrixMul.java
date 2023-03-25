//Matrix Multiplication
//number of columns in first matrix must be equal to the number of rows in second matrix
//the resultant matrix will have number of rows of first matrix and number of columns of second matrix
import java.util.*;
class MatrixMul{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{7,8},{9,1},{3,5}};
        int[][] c=new int[a.length][b[0].length];
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            for(int k=0;k<b[0].length;k++){
                for(int j=0;j<a[0].length;j++){
                    sum=sum+a[i][j]*b[j][k];
                    c[i][k]=sum;
                }
                sum=0;
            }
               
            
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}