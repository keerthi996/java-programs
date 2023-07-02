/*
 * This means that the floating-point calculations inside the method will adhere to strict 
 * floating-point rules, regardless of the underlying platform. This ensures consistent results
 *  when performing floating-point calculations, which might otherwise vary slightly across 
 * different platforms due to differences in their floating-point hardware or implementation.
 */

class StrictfpEx{ 
    public static void main(String[] args){
        MyClass mc=new MyClass();
        double res=mc.performCalculation(123.45,345.67);
        System.out.println(res);
    }
}
