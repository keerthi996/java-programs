import java.lang.Math;
public class MethodReferenceEx3 {
    public static void main(String[] args) {
        int num=30;
        MyFunction squareroot=Math::sqrt;
        double result=squareroot.performOperation(num);
        
        System.out.println("Square root of " + num + " is: " + result);
    }
}
@FunctionalInterface
interface MyFunction {
    double performOperation(int a);
}

