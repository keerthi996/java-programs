/*program to print Swastik symbol:
a[][]={ {1,2,3,4,11},    a[][]={{1,2,3,4,5,6,7},{2,3,4,5,6,7,1},{3,4,5,6,7,1,2},{4,5,6,7,1,2,3},{5,6,7,1,2,3,4},{6,7,1,2,3,4,5},{7,1,2,3,4,5,6}}
        {5,6,7,8,10},
        {9,8,7,6,12},
        {4,8,5,6,2},
        {1,9,6,4,7}}
*/
class SwastikElements{
    public static void main(String args[]){
        int a[][]={{1,2,3,4,5,6,7},{2,3,4,5,6,7,1},{3,4,5,6,7,1,2},{4,5,6,7,1,2,3},{5,6,7,1,2,3,4},{6,7,1,2,3,4,5},{7,1,2,3,4,5,6}};
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<=n/2;j++){
                    System.out.print(a[i][j]+" ");
                }
                for(int j=n/2;j<n-1;j++){
                    System.out.print(" ");
                }
                System.out.print(" "+a[i][n-1]);
            }
            else if((i>=1 && i<n/2)){
                for(int j=0;j<n/2;j++){
                    System.out.print("  ");
                }
                System.out.print(a[i][n/2]);
                for(int j=n/2+1;j<n-1;j++){
                    System.out.print("  ");
                }
                System.out.print(" "+a[i][n-1]);
            }
            else if((i>n/2 && i<n-1)){
                System.out.print(a[i][1]+" ");
                for(int j=1;j<n/2;j++){
                    System.out.print("  ");
                }
                System.out.print(a[i][n/2]);
            }
            else if(i==n-1){
                System.out.print(a[i][0]+" ");
                for(int j=1;j<n/2;j++){
                    System.out.print("  ");
                }
                for(int j=n/2;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else if(i==n/2){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        
    }
}