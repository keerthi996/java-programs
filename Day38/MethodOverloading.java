//Program for Method Overloading
class MethodOverloading{
    static void sum(int x,int y){
        System.out.println(x+y);
    }
    static void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public static void main(String args[]){
        MethodOverloading mo=new MethodOverloading();
        mo.sum(3,5);
        mo.sum(2,3,4);
    }
}