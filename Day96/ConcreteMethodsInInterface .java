class ConcreteMethodsInInterface implements MyInterface{
    public static void main(String[] args) {

        ConcreteMethodsInInterface ci= new ConcreteMethodsInInterface();

        ci.defaultMethod();

    }

}
interface MyInterface {

    default void defaultMethod() { 

        System.out.println("Implementation of Default Method");

    }

    static void staticMethod() {  

        System.out.println("Implementation of static method");
    }

}