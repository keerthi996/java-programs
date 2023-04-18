//to find whwther the given array is magic matrix or not
//Magic square means sum of every row and every column and two diagonals must be equal
class MagicMatrix{
    static boolean isMagicMatrix(int[][] arr,int n){
        int sumOfD1=0,sumOfD2=0,columnSum=0,rowSum=0;
        for(int i=0;i<n;i++){
            sumOfD1+=arr[i][i];
            sumOfD2+=arr[i][n-i-1];
        }
        if(sumOfD1!=sumOfD2){
            return false;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
                columnSum+=arr[j][i];
            }
            if(rowSum!=columnSum||columnSum!=sumOfD1){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[][]={{2,7,6},{9,5,1},{4,3,8}};
        int n=arr.length;
        if(isMagicMatrix(arr,n)){
            System.out.println("Yes it is a magic matrix");
        }
        else{
            System.out.println("Yes it is a magic matrix");
        }
    }
}