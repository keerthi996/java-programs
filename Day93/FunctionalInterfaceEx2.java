import java.lang.Math;
class FunctionalInterfaceEx2{
    public static void main(String[] args){
        
        MyFunction power = Math::pow;
        System.out.println(power.performOperation(2, 3)); 
        

    }
}
@FunctionalInterface
interface MyFunction {
    double performOperation(int a, int b);
}
