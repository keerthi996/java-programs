class MinMax{
    public static void main(String args[]){
        int a[]={5,9,3,2,6,7,4};
        int CurrentMin=a[0];
        int maxDiff=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<minTillNow){
                minTillNow=a[i];
            }
            int diff=a[i]-CurrentMin;
            if(diff>maxDiff){
                maxDiff=diff;
            }
        }
        System.out.println(maxDiff);
    }
}