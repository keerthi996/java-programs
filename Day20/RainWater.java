//  RAIN WATER TRAPPING PROBLEM
class RainWater{
    public static void main(String args[]){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int res=0;
        for(int i=1;i<arr.length-1;i++){
            int left=arr[i];
            int right=arr[i];
            for(int j=0;j<i;j++){
                left=Math.max(left,arr[j]);
            }
            for(int j=i+1;j<arr.length;j++){
                right=Math.max(right,arr[j]);
            }
            res=res+Math.min(left,right)-arr[i];

        }
        System.out.println(res);
    }
}