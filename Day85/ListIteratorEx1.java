import java.util.*;
import java.util.ListIterator;
class ListIteratorEx1{
    public static void main(String[] args){
        List<Integer> lst=new ArrayList<>();
        lst.add(12);
        lst.add(34);
        lst.add(65);
        ListIterator<Integer> li=lst.listIterator();
        System.out.println(li.hasNext());
        System.out.println(li.hasPrevious());
        System.out.println(li.next());
        System.out.println(li.previous());
    }
} 