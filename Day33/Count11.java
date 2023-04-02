class Count11{
    public static void main(String[] args){
        int arr[]={11,1,8,9,1,2,11,11};
        int index=0;
        System.out.println(find11(arr,index));
    }
    static int find11(int[] nums, int index) {
   if(index==nums.length)
  return 0;
  if(nums[index]==11)
  return 1+find11(nums,index+1);
  return find11(nums,index+1);
  
}

}
