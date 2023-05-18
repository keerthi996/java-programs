/*
    Implements Set Interface.
    As it implements the Set Interface, duplicate values are not allowed.
    Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
    NULL elements are allowed in HashSet.
    HashSet also implements Serializable and Cloneable interfaces.
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        //Adding elements into the set
        set.add(10);
        set.add(20);
        set.add(4);
        set.add(14);
        set.add(20);
        System.out.println(set);
        //Different methods in HashSet
        set.remove(20);
        System.out.println(set);
        System.out.println(set.contains(20));
        System.out.println(set.isEmpty());

    }
}
