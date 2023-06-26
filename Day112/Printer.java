public class Printer {
    public void print(Object obj) {
        if (obj instanceof Printable) {
            // Process the object for printing
            System.out.println("Printing: " + obj.toString());
        } else {
            System.out.println("Object is not printable");
        }
    }
}

