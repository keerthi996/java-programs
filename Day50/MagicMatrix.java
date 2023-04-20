
class MagicMatrix{
    static int a[][]={{9,5,6},{2,4,1},{7,3,8}};
    static boolean isMagicMatrix(){
        int sumOfD1=0,sumOfD2=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            sumOfD1+=a[i][i];
            sumOfD2+=a[i][n-i-1];
        }
        if(sumOfD1!=sumOfD2){
            return false;
        }
        for(int i=0;i<n;i++){
        	int columnSum=0,rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=a[i][j];
                columnSum+=a[j][i];
            }
            if(rowSum!=columnSum||columnSum!=sumOfD1){
                return false;
            }
        }
        return true;
    }
    static void display(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swapElements(){
        int fElementRow=(int)(Math.random()*3.0);
        int fElementColumn=(int)(Math.random()*3.0);
        int sElementColumn=(int)(Math.random()*3.0);
        int sElementRow=(int)(Math.random()*3.0);
        int temp=a[fElementRow][fElementColumn];
        a[fElementRow][fElementColumn]=a[sElementRow][sElementColumn];
        a[sElementRow][sElementColumn]=temp;
    }
    public static void main(String args[]){
        do{
            swapElements();
        }
        while(!isMagicMatrix());
        display();
    }
}
