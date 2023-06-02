import java.util.BitSet;

class BitsetEx5{
    public static void main(String[] args){
        BitSet s=new BitSet();
        
        s.set(1);
        s.set(10);
        s.set(6);
        s.set(1,false);
        s.set(11,15,true);
        s.set(63);

        System.out.println(s);

        BitSet s2=new BitSet();
        s2=(BitSet)s.clone();

        System.out.println(s2);
    }
}