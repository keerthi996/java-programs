//Program to demonstrate heirarchial inheritance
class A{
    void print(){
        System.out.println("Hello");
    }
}
class B extends A{
    void sayHi(){
        System.out.println("HI");
    }
}
class C extends A{
    void sayBye(){
        System.out.println("Bye!");
    }
}
class Heirarchial{
    public static void main(String args[]){
        B b1=new B();
        b1.print();
        b1.sayHi();
        C c1=new C();
        c1.print();
        c1.sayBye();
        
    }
}