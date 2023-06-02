/*
    The size() method of Java BitSet class returns the total number of bit space actually in use
    by this BitSet to represent bit values. The maximum element in the set is the size - 1st element.

    The default size of the bit set is 64-bit space. If the bit is set at index larger than the
    current BitSet size, it increases its bit space in the multiplication of 64*n, where n starts 
    from 1, 2, 3, so on.

*/
import java.util.*;
class BitsetEx1{
    public static void main(String[] args){
        BitSet s=new BitSet();
        
        s.set(1);
        s.set(10);
        s.set(6);
        s.set(1,false);
        s.set(11,15,true);
        s.set(63);
        System.out.println(s.size());

        BitSet s1=new BitSet();
        
        s1.set(1);
        s1.set(10);
        s1.set(6);
        s1.set(1,false);
        s1.set(11,15,true);
        
        System.out.println(s1.size());


        BitSet s2=new BitSet();
        
        s2.set(1);
        s2.set(10);
        s2.set(6);
        s2.set(1,false);
        s2.set(11,15,true);
        s2.set(127);
        s2.set(112);
        System.out.println(s2.size());

        BitSet s3=new BitSet();
        
        s3.set(1);
        s3.set(10);
        s3.set(6);
        s3.set(1,false);
        s3.set(11,15,true);
        s3.set(127);
        s3.set(112);
        s3.set(256);
        System.out.println(s3.size());

    }
}