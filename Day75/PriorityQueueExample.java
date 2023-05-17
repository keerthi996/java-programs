//Priority Queue
/*  In the Java queue, object insertion and deletion are described as following a FIFO pattern. 
    However, a PriorityQueue can be used when it is necessary to process queue elements in accordance with their priority.
*/
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Retrieve and remove elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Removed element: " + element);
        }
        //By default it gives priority in ascending order
    }
}
