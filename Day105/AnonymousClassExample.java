/*
An anonymous class in Java is a class that is declared and instantiated at the same time, 
without explicitly providing a name for the class. It is a way to create a one-time-use class 
that extends an existing class or implements an interface without the need to define a separate
 named class.
*/
public class AnonymousClassExample {
    public static void main(String[] args) {
        // Create an instance of an anonymous class implementing the Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class is running.");
            }
        };

        // Execute the run() method of the anonymous class
        runnable.run();
    }
}
