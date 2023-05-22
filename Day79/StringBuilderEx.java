/*StringBuilder in Java represents a mutable sequence of characters. Since the String Class in 
Java creates an immutable sequence of characters, the StringBuilder class provides an
alternative to String Class, as it creates a mutable sequence of characters.
*/
public class StringBuilderEx{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb.toString()); // Output: "Hello world!"
         
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString()); // Output: "Hello beautiful world!"
         
        sb.reverse();
        System.out.println(sb.toString()); // Output: "!dlrow lufituaeb olleH"
    }
}
