//accsessing elements and adding elements at any loaction in the arrayList
import java.util.ArrayList;
class ArrayListEx1{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(0,45);
        arr.add(1,15);
        arr.add(0,63);
        arr.add(2,90);
        arr.add(3,78);
        System.out.println(arr);
        System.out.println(arr.size());//length of the array
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Element at index 3 is :"+arr.get(3));//get method is used to get element at the given index
        for(Integer i:arr){
            System.out.println(i);//Using for each loop
        }
    }
}