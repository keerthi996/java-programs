import java.util.*;


class BitsetEx3{
    public static void main(String[] args){
        BitSet s1=new BitSet();
        
        s1.set(1);
        s1.set(10);
        s1.set(6);
        s1.set(1,false);
        s1.set(11,15,true);

        System.out.println(s1);

        long[] arr=s1.toLongArray();
        System.out.println(Arrays.toString(arr));
    }
}