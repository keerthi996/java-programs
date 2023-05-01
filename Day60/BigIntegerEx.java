import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args){
        BigInteger b1=new BigInteger("1456");
        BigInteger b2=new BigInteger("17896");
        BigInteger b3=new BigInteger("-1452");
        BigInteger b4=new BigInteger("81");
        System.out.println(b1.add(b2));
        System.out.println(b2.subtract(b1));
        System.out.println(b1.min(b2));
        System.out.println(b1.max(b2));
        System.out.println(b3.abs());
        System.out.println(b4.sqrt());
        System.out.println(b1.multiply(b4));
        System.out.println(b2.divide(b1));
        System.out.println(b1.compareTo(b4));
        System.out.println(b4.pow(2));
        System.out.println(b1.and(b2));
        System.out.println(b1.bitLength());
        System.out.println(b1.floatValue());
        System.out.println(b2.intValue());
        System.out.println(b3.doubleValue());
        System.out.println(b4.negate());
        System.out.println(b4.not());
    }

}
