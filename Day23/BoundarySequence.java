/*Boundary elements in sequence
  a={{1,2,3,4},
     {5,6,7,8},
     {10,11,12,13}}
     result=1,2,3,4,8,13,12,11,10,5
*/
class BoundarySequence{
    public static void main(String args[]){
        int a[][]={{1,2,3,4},{5,6,7,8},{10,11,12,13}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length-1;j++){
                if(i==0){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=a[i].length-1;j>=0;j--){
                if(j==a.length-1||i==a.length-1){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        for(int i=a.length-2;i>=1;i--){
           System.out.print(a[i][0]+" ");
        }
    }
}