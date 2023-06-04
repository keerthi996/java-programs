public class LazySingletonClass {

    public static void main(String[] args) {

        System.out.println(A.getInstance());

        System.out.println(A.getInstance());
    }
}
class A {
    private  static A myObj; 
    private A() {

    }
    public static A getInstance() {

        if(myObj == null) { 
            myObj = new A();

        }

        return myObj;

    }

}