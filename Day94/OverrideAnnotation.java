//Understanding @override annotation
/*@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.

Sometimes, we does the silly mistake such as spelling mistakes etc. So, it is better to mark @Override annotation that provides assurity that method is overridden. */



class OverrideAnnotation{
    public static void main(String[] args){
        Dog d=new Dog();
        d.print();
    }
}
class Animal{
    void print(){
        System.out.println("Hi...this is Animal");
    }
}
class Dog extends Animal{
    @Override
    void print(){
        System.out.println("Hi...this is Dog");
    }
}