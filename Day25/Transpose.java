import java.util.Arrays;
class Transpose{
    public static void main(String args[]){
        int[][] a={
            {2,3,6},{4,5,8}
        };
        int[][] b=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}