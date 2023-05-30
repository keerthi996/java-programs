/*In order to remove an element from a deque, there are various methods available.
    Since we can also remove from both ends, the deque interface provides us with removeFirst(),
    removeLast() methods. Apart from that, this interface also provides us with the poll(), 
    pop(), pollFirst(), pollLast() methods where pop() is used to remove and return the head of 
    the deque. However, poll() is used because this offers the same functionality as pop() and 
    doesn’t return an exception when the deque is empty. 
*/
import java.util.*;
public class DequeEx1 {
    public static void main(String[] args)
    {
        
        Deque<String> dq
            = new ArrayDeque<String>();
 
        
        dq.add("Thanusha");
        dq.addFirst("Keerthi");
        dq.addLast("Shashank");
 
        System.out.println(dq);
 
        System.out.println(dq.pop());
 
        System.out.println(dq.poll());
 
        System.out.println(dq.pollFirst());
 
        System.out.println(dq.pollLast());
    }
}