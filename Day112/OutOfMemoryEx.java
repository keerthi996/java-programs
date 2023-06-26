import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryEx{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        try {
            while (true) {
                list.add(1);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of Memory Error: Java Heap Space");
        }
    }
}
