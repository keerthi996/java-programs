import java.util.HashSet;
import java.util.Iterator;

public class Targetsum {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(23);
        set.add(7);
        set.add(5);
        set.add(12);
        set.add(9);
        set.add(3);
        set.add(11);
        set.add(6);
        set.add(15);

        int target=20;
        Iterator<Integer> i= set.iterator();
        while(i.hasNext()){
            int cur=i.next();
            int reqTarget=target-cur;
            if(set.contains(reqTarget)){
                System.out.println(cur+" + "+reqTarget+" ="+target);
            }
        }
    }
}
