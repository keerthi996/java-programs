//Find the highest frequency number in the given array
import java.util.HashMap;
class HighestFrequency{
    public static void main(String[] args){
        int arr[]={1,4,5,6,6,7,8,9,2,3,4,5,6,5,4,3,2,1,2,3,43,4,3,4,3,4,5,2,3,2,2,2,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int increment=map.get(arr[i])+1;
                map.put(arr[i],increment);
            }
        }
        System.out.println(map);
        int max=0;
        int value=-1;
        for(HashMap.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()>max){
                max=x.getValue();
                value=x.getKey();
            }
        }
        System.out.println(value+" is repeated "+max+" times");
    }
}