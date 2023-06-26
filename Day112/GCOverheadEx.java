/*
    The "GC overhead limit exceeded" error is another type of Out of Memory Error in Java. It
    occurs when the garbage collector (GC) spends an excessive amount of time performing garbage
    collection but reclaims only a small amount of memory in each cycle. This error is thrown to
    prevent the JVM from getting stuck in an endless cycle of garbage collection with little 
    overall memory reclamation.
*/
import java.util.ArrayList;
import java.util.List;

public class GCOverheadEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            while (true) {
                for (int i = 0; i < 100000; i++) {
                    String value = String.valueOf(i);
                    list.add(value);
                }
                list.clear();
            }
        } catch (OutOfMemoryError e) {
            System.out.println("GC overhead limit exceeded");
        }
    }
}
/*
 * In this example, an infinite loop continuously adds strings to an ArrayList and then clears
 *  it. The loop keeps repeating this process, causing significant garbage collection activity.
 *  However, since the objects are short-lived and constantly cleared, the garbage collector 
 * struggles to reclaim memory effectively.

Eventually, the JVM detects that the garbage collection overhead is too high, and it throws 
the "GC overhead limit exceeded" error.
 */
