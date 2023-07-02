class StrictfpEx1{
    public static void main(String[] args){
        Child c=new Child();
        double res=c.calculate(12.78,17.89);
        System.out.println(res);
        
    }
}
/*
 *  using "strictfp" is necessary only when you require precise floating-point calculations
 *  across different platforms. For most general use cases, Java's default floating-point 
 * behavior is sufficient. The "strictfp" keyword is mainly useful when you want to ensure
 *  consistent results in critical applications where slight variations in floating-point 
 * calculations could have significant consequences.
 */