//converting list to array
import java.util.*;
class ListToArray{
    public static void main(String[] args){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(20) ;
        l1.add(90);
        l1.add(14);
        Object[] arr=l1.toArray();
        System.out.println(Arrays.toString(arr));
    }
}