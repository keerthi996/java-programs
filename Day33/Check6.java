//to check whether the given array contains 6 
class Check6{
    public static void main(String[] args){
        int nums[]={5,4,3,7,6};
        int index=0;
        System.out.println(find(nums,index));
    }

static boolean find(int[] nums, int index) {
  if(index==nums.length)
  return false;
  if(nums[index]==6)
  return true;
  return find(nums,index+1);
}
}