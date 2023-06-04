class ExtendingSuperConductor{
    public static void main(String[] args){
        B b=new B();
    }
}
class A{
    public A(){
        System.out.println("Calling constructor A....");
    }
}
class B extends A{
    public B(){
        System.out.println("Calling constructor B...");
    }
}