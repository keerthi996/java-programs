/*    Deep Copy:
    Deep copy, on the other hand, creates a completely independent copy of an object, including all of its nested objects. Any modifications made to the original object will not affect the copied object, and vice versa.

To achieve a deep copy in Java, you can implement the Cloneable interface and override the clone() method. Alternatively, you can use libraries like Apache Commons Lang or Gson for deep copying complex objects. */
class Person implements Cloneable {
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
  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class DeepCopyEx{
    public static void main(String[] args) {
        try {
            Person original = new Person("Keerthi");
            Person copy = (Person) original.clone(); // Deep copy
  
            System.out.println(original.getName()); // Output: Keerthi
            System.out.println(copy.getName()); // Output: Keerthi
  
            copy.setName("Thanusha");
  
            System.out.println(original.getName()); // Output: Keerthi
            System.out.println(copy.getName()); // Output: Thanusha
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
