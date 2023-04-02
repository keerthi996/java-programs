//to find out the maximum among the row sum
class RowSum{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int index=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[0].length;j++){
                sum+=a[i][j];
            }
            System.out.println(sum+" "+i);
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println(max+" "+index);
    }
}