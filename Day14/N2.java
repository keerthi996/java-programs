//n2 time complexity:
class N2{
    public static void main(String args[]){
        int[][] arr={{2,3},{4,5}};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}