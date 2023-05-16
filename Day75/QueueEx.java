/*
    The interface Queue is available in the java.util package and does extend the Collection
     interface. It is used to keep the elements that are processed in the First In First Out (FIFO) manner. 
     It is an ordered list of objects, where insertion of elements occurs at the end of the list, and 
     removal of elements occur at the beginning of the list.
*/
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;
class QueueEx{
    public static void main(String[] args){
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove(20);
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue);
    
        
    }
}