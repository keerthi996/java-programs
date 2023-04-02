//to find out maximumum sum both in row-wise and column-wise
class MaxSum{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int cIndex=0;
        int colMax=0;
        int rowMax=0;
        int rIndex=0;
        
        for(int i=0;i<a[0].length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[j][i];
            }
            if(sum>colMax){
                colMax=sum;
                cIndex=i;
            }
        }
        System.out.println(colMax+" "+cIndex);
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[0].length;j++){
                sum+=a[i][j];
            }
            if(sum>rowMax){
                rowMax=sum;
                rIndex=i;
            }
        }
        System.out.println(rowMax+" "+rIndex);
        if(colMax>rowMax){
            System.out.println("Sum is maximum in column number "+cIndex+" and the sum is "+colMax);
        }
        else{
            System.out.println("Sum is maximum in row number "+rIndex+" and the sum is "+rowMax);
        }
    }
}