class Unique{
    public static void main(String args[]){
        int a[]={1,2,4,5,2,3,7,8,9};
        int count;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(a[i]);
            }
        }
    }
}