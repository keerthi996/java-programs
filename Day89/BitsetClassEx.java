/*
     In Java, the BitSet class is a part of the java.util package and is used to manipulate 
     a sequence of bits. It provides a compact way to store and perform operations on sets of
      bits or flags. Each bit in a BitSet can be set to either 0 or 1.
*/ 
import java .util.BitSet;
class BitsetClassEx{
    public static void main(String[] args){
        BitSet set=new BitSet();
        //to set index number as true we use set() method
        set.set(1);
        set.set(10);
        set.set(6);
        set.set(1,false);
        set.set(11,15,true);
        System.out.println(set);
    }
}