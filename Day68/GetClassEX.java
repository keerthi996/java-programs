public class GetClassEX {
    public static void main(String[] args){
        Hello h=new Hello();
        System.out.println(h.getClass());
        System.out.println(h.getClass().getName());
    }
}
class Hello{
    void printHello(){
        System.out.println("Hello...");
    }
}
