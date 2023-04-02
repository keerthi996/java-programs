//to find sub array of an array
class SubArray{
    public static void main(String[] args){
      int a[]={1,2,3,4};
      for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
        System.out.println();
        for(int j=i+1;j<a.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
      }
    }
}
