import java.util.BitSet;

class BitsetEx4{
    public static void main(String[] args){
        BitSet s=new BitSet();
        
        s.set(1);
        s.set(10);
        s.set(6);
        s.set(1,false);
        s.set(11,15,true);
        s.set(63);
        

        BitSet s1=new BitSet();
        
        s1.set(1);
        s1.set(10);
        s1.set(6);
        s1.set(1,false);
        s1.set(11,15,true);

        System.out.println(s.equals(s1));
    
    }
}