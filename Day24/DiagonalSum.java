//sum of diagonal elements:
class DiagonalSum{
    public static void main(String args[]){
        int a[][]={{1,2,3,4,11},{5,6,7,8,10},{9,8,7,6,12},{4,8,5,6,2},{1,9,6,4,7}};
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i||j==n-i-1){
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}