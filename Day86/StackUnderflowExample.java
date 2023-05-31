import java.util.EmptyStackException;
import java.util.Stack;

public class StackUnderflowExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        try {
            int element = stack.pop(); // Trying to retrieve an element from an empty stack
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty: " + e.getMessage());
        }
    }
}
