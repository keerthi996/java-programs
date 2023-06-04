class SuperEx{
    public static void main(String[] args){
        A a1=new A();
        A a2=new A(10);
        A a3=new A(10,20);

    }
}
class A{
    public A(){
        System.out.println("Empty constructor..");
    }
    public A(int x){
        System.out.println("Constructor with one argument");
    }
    public A(int x,int y){
        System.out.println("Constructor with two arguments");
    }
}