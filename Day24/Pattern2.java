//    a[][]={{1,2,3,4,11},{5,6,7,8,10},{9,8,7,6,12},{4,8,5,6,2},{1,9,6,4,7}}
class Pattern2{
    public static void main(String args[]){
        int a[][]={{1,2,3,4,11},{5,6,7,8,10},{9,8,7,6,12},{4,8,5,6,2},{1,9,6,4,7}};
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(a[j][i]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(a[j][i]+" ");
                }
            }
        }
    }
}