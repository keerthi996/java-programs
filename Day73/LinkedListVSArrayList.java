import java.util.*;
public class LinkedListVSArrayList {
    public static void main(String[] args) {
        
                List<Integer> list = new LinkedList<>();
                long start = System.currentTimeMillis();
         
                for (int i = 0; i < 5_000_000; i++) {
                    list.add(i);
                }
                System.out.println("Time taken by LinkedList (in milliseconds) = " + (System.currentTimeMillis()-start)); //takes 719ms

                List<Integer> arraylist = new ArrayList<>();
                start = System.currentTimeMillis();

                
                for (int i = 0; i < 5_000_000; i++) {
                    arraylist.add(i);
                }
         
                System.out.println("Time taken by ArrayList (in milliseconds) = " + (System.currentTimeMillis()-start)); // takes 715ms
    }
}