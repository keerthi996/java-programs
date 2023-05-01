import java.math.BigDecimal;

public class BitDecimalEx {
    public static void main(String[] args){
        double a=0.04;
        double b=0.03;
        System.out.println(a-b);
        BigDecimal b1=new BigDecimal("0.04");
        BigDecimal b2=new BigDecimal("0.03");
        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(b2));
        System.out.println(b1.max(b2));
        System.out.println(b1.min(b2));
        System.out.println(b1.compareTo(b2));
        /*    0 : if value of this BigDecimal is equal to that of BigDecimal object passed as parameter.
              1 : if value of this BigDecimal is greater than that of BigDecimal object passed as parameter.
             -1 : if value of this BigDecimal is less than that of BigDecimal object passed as parameter.*/
        System.out.println(b1.pow(2));
        System.out.println(b1.divide(new BigDecimal(2)));
    }
}
