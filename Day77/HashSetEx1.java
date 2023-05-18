import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(15);
        set.add(30);
        set.add(45);
        set.add(60);
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
