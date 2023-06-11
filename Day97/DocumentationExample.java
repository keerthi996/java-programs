/**
 * this class is created to demonstrate the use of documentation
 */
public class DocumentationExample {
    public static void main(String[] args){
        add(4,5);
        System.out.println(sub(9,5));
        System.out.println(upper("keerthi"));
        System.out.println(multiply(2,3));
    }

    /**
     *this method will return the addition of two numbers
     * @param a
     * @param b
     */
    static void add(int a,int b){
        System.out.println(a+b);
    }

    /**
     *this method will return the difference of two numbers
     * @param a
     * @param b
     * @return integer
     */

    static int sub(int a,int b){
        return a-b;
    }

    /**
     *this method returns the uppercase of the string
     * @param s
     * @return string
     * the uppercase of the string
     */
    static String upper(String s){
        return s.toUpperCase();
    }

    /**
     * this method will return the product of two numbers
     * @see public
     * @param a
     * @param b
     * @return integer
     */
    public static int multiply(int a,int b){
        return a*b;
    }
}
