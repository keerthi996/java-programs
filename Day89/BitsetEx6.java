import java.util.BitSet;

class BitsetEx6{
    public static void main(String[] args){
        BitSet s=new BitSet();
        
        s.set(1);
        s.set(10);
        s.set(6);
        s.set(1,false);
        s.set(11,15,true);
        s.set(63);

        System.out.println(s);

        s.flip(11, 15);


        System.out.println(s);
    }
}