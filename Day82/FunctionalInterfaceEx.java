/*A functional interface is an interface that contains only one abstract method.
 They can have only one functionality to exhibit. From Java 8
  onwards, lambda expressions can be used to represent the instance of a functional interface
*/
class FunctionalInterfaceEx{
    public static void main(String[] args){
        int a=5;
        Square s=(int x)->x*x;
        int res=s.calculate(a);
        System.out.println(res);
    }
}
interface Square{
    int calculate(int x);
}