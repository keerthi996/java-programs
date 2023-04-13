// nested classes using static Access sepecifier
public class Addition{
    public static void main(String args[]){
        
        Ex1.Test1 t1=new Ex1.Test1();
        System.out.println(t1.add(2,3));
    }
}
class Ex1{
    static class Test1{
        int add(int a,int b){
        return a+b;
    }
    }
}