/*
 * Shallow Copy:
Shallow copy creates a new object and copies the reference of the original object into it. 
Both the original object and the copy refer to the same memory location, so any changes made
 to one object will reflect in the other.
 */
class Person {
    private String name;
  
    public Person(String name) {
        this.name = name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public String getName() {
        return name;
    }
}

public class ShallowCopyEx {
    public static void main(String[] args) {
        Person original = new Person("Keerthi");
        Person copy = original; // Shallow copy
  
        System.out.println(original.getName()); // Output: keerthi
        System.out.println(copy.getName()); // Output:keerthi
  
        copy.setName("Thanusha");
  
        System.out.println(original.getName()); // Output: thanusha
        System.out.println(copy.getName()); // Output: thanusha
    }
}
