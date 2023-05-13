//Vector implements a dynamic array which means it can grow or shrink as required. Like an array.
import java.util.*;
class VectorsEx{
    public static void main(String[] args){
        Vector<Integer> v1=new Vector<>();//Vector that takes integer elements only
        v1.add(10);
        v1.add(20);
        v1.add(40);
        v1.add(50);
        System.out.println(v1);
        //Accessing array elements
        System.out.println(v1.get(2));
        //Iterating through array elements using for loop
        for(int i=0;i<v1.size();i++){
            System.out.println(v1.get(i));
        }
        //iterating using for each loop
        for(Integer i:v1){
            System.out.println(i);
        }

    }
}