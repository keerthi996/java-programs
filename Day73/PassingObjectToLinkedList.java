import java.util.*;
class PassingObjectToLinkedList{
    public static void main(String[] args){

        LinkedList<Fruits> lst=new LinkedList<>();
        Fruits f=new Fruits();
        f.name="Mangoes";
        f.price=50.0f;
        Fruits f1=new Fruits();
        f1.name="Banana";
        f1.price=20.0f;
        lst.add(f1);
        lst.add(f);
        System.out.println(lst);
    }
}
class Fruits{
    String name;
    float price;
    @Override
    public String toString(){
        return "name:"+name+",price:"+price;
    }
    
}