//Program to print corner elements:
//    a[][]={{1,2,3,4,11},{5,6,7,8,10},{9,8,7,6,12},{4,8,5,6,2},{1,9,6,4,7}}
class CornerElements{
    public static void main(String args[]){
        int a[][]={{1,2,3,4,11},{5,6,7,8,10},{9,8,7,6,12},{4,8,5,6,2},{1,9,6,4,7}};
        int n=a.length;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                if((i==0 && j==0)||(i==0 && j==n-1)||(i==n-1 && j==n-1)||(i==n-1 && j==0)){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
           }
           System.out.println();
        }
    }
}