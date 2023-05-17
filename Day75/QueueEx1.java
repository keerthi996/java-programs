//Accessing Queue elements using hasNext()
import java.util.*;
class QueueEx1{
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        Iterator<Integer> itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); 
        }
    }
}