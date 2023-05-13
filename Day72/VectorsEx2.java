//Vector methods
import java.util.*;
class VectorsEx2{
    public static void main(String[] args){
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add("Hi");
        v.add(23.6f);
        System.out.println(v);
        v.remove(1);
        v.add(0,"Hello");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.firstElement());
        System.out.println(v.isEmpty());
        System.out.println(v.lastElement());
    }
}