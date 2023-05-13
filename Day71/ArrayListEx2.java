//Methods in arrayList
import java.util.ArrayList;
class ArrayListEx2{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.add(50);
        System.out.println(arr);
        System.out.println(arr.contains(20));
        System.out.println(arr.indexOf(30));
        arr.add(30);
        System.out.println(arr.lastIndexOf(30));
        arr.add(3,40);
        System.out.println(arr);

    }
}