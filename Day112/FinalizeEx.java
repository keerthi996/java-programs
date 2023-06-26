public class FinalizeEx {

    public static void main(String[] args) {

        Example e = new Example();

        e= null;

        System.gc(); 

    }
}
class Example {
    
    @Override
    protected void finalize() throws Throwable {

        System.out.println("finalize method called");

    }
}