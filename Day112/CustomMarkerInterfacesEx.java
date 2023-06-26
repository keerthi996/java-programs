// Custom marker interface

public class CustomMarkerInterfacesEx {
    public static void main(String[] args) {
        Book book = new Book("Half Girlfriend", "Chetan Bhagat");
        Printer printer = new Printer();
        printer.print(book); // Prints the book since it implements Printable interface

        String message = "Hello, World!";
        printer.print(message); // Does not print the string since it does not implement Printable interface
    }
}
