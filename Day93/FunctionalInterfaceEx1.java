import java.lang.Math;
class FunctionalInterfaceEx1{
    public static void main(String[] args){
        MyFunction addition = (a, b) -> a + b;
        System.out.println(addition.performOperation(2, 3));  
        MyFunction multiplication = (a, b) -> a * b;
        System.out.println(multiplication.performOperation(2, 3)); 

        MyFunction subtraction = (a, b) -> a - b;
        System.out.println(subtraction.performOperation(5, 3));  

        MyFunction division = (a, b) -> a / b;
        System.out.println(division.performOperation(10, 2));  

        

    }
}
@FunctionalInterface
interface MyFunction {
    int performOperation(int a, int b);
}
