//anonymous classes are not declared but can create object and implement methods
public class AnonymousExample{
   public static void main(String[] args) {
      // Anonymous class that extends the Thread class
      Thread t = new Thread() {
         public void run() {
            System.out.println("Hello, world!");
         }
      };
      t.start();
      System.out.println("HI...");
   }
}