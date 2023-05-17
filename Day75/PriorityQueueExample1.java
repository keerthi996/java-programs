/*In Java, you can assign priorities to elements in a priority queue by using a custom comparator or by implementing the Comparable interface for the elements you want to prioritize.

    Custom Comparator:
    You can create a custom comparator that defines the priority order for the elements in the priority queue. The comparator should implement the Comparator interface and provide the logic to compare elements based on their priorities.
*/
import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        // Create a priority queue of custom objects
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(new Person("Alice", 25));
        priorityQueue.add(new Person("Bob", 30));
        priorityQueue.add(new Person("Charlie", 20));

        // Retrieve and remove elements from the priority queue
        while (!priorityQueue.isEmpty()) {
            Person person = priorityQueue.poll();
            System.out.println("Removed element: " + person.getName());
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare persons based on their ages (lower age has higher priority)
        return Integer.compare(this.age, other.getAge());
    }
}
