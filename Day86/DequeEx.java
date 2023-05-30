/*Deque interface present in java.util package is a subtype of the queue interface. 
    The Deque is related to the double-ended queue that supports the addition or removal of 
    elements from either end of the data structure. It can either be used as a 
    queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO).
*/
import java.util.ArrayDeque;
import java.util.Deque;
 
public class DequeEx {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    deque.add(23);
    deque.add(56);
    deque.removeFirst();
    deque.removeLast();
    System.out.println(deque);
  }
}