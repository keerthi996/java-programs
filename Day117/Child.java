public class Child extends Parent {
    // This method is implicitly strictfp since the class is strictfp
    public double calculate(double a, double b) {
        return super.calculate(a, b) + a + b;
    }
}