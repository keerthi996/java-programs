/*Inheritance:
inheritance is of three types in java 
    1.Single level inheritance
    2.Multilevel inheritance
    3.HEirarchial inheritance
*/
//Example for single level inheritance
class SingleLevel{
    int add(int a,int b){
        return a+b;
    }
}
class Single extends SingleLevel{
    public static void main(String args[]) {
        Single sl=new Single();
        System.out.println(sl.add(10, 20));
        
    }
}
