//List iterator
import java.util.*;
import java.util.ListIterator;
class ListIteratorEx{
    public static void main(String[] args){
        List<Integer> lst=new ArrayList<>();
        lst.add(12);
        lst.add(34);
        lst.add(65);
        ListIterator<Integer> li=lst.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());

        }
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
} 