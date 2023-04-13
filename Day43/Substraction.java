//nested classes using private access specifier
//private class methods cannot be accessed outside the parent class 
public class Substraction{
    public static void main(String args[]){
        
        //Ex1.Test1 t1=new Ex1.Test1();
        //System.out.println(t1.add(6,3));
        Ex1 e=new Ex1();
        e.subs();
    }
}
class Ex1{
    private class Test1{
        int sub(int a,int b){
            return a-b;
        }
    }
    void subs(){
        Test1 t=new Test1();
        System.out.println(t.sub(8,2));
    }
}