/*
    The length() method of Java BitSet class returns the "logical size" of this BitSet. 
    The length of BitSet goes up to the index of the highest set bit plus one. It returns zero
    if the BitSet does not contain any set bit.  
 */
import java.util.*;
  
public class BitsetEx2 {
    public static void main(String args[])
    {
        
        BitSet bitset = new BitSet();
  
        
        bitset.set(40);
        bitset.set(25);
        bitset.set(31);
        bitset.set(100);
        bitset.set(53);
  
        // Displaying the BitSet
        System.out.println("BitSet: " + bitset);
  
        // Displaying the length or logical size
        System.out.println("The Length is: "
                           + bitset.length());
    }
}