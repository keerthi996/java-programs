public class DeprecatedExample {

    public static void main(String[] args){
        Example e=new Example();
        e.oldMethod();
            /*Note: DeprecatedExample.java uses or overrides a deprecated API.
            Note: Recompile with -Xlint:deprecation for details.
        */
        e.newMethod();
    }
}
class Example{
    @Deprecated
    public void oldMethod() {
        System.out.println("Old method..");
    }

    public void newMethod() {
        System.out.println("New method..");
    }
}
