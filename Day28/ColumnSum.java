//sum of elements in column
class ColumnSum{
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int index=0;
        int max=0;
        for(int i=0;i<a[0].length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[j][i];
            }
            System.out.println(i);
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println(max+" "+index);
    }
}