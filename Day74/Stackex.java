/*   In Java, the Stack class is a subclass of the Vector class and represents a last-in-first-out (LIFO) stack of objects.
         It extends the Vector class to allow for easy implementation of the stack data structure.
*/
import java.util.*;
class Stackex{
    public static void main(String[] args){
        Stack s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);


        

    }
}