public class DocumentationExample {
    public static void main(String[] args){
        add(4,5);
        System.out.println(sub(9,5));
        System.out.println(upper("keerthi"));
        System.out.println(multiply(2,3));
    }

    /**
     *
     * @param a
     * @param b
     */
    static void add(int a,int b){
        System.out.println(a+b);
    }

    /**
     *
     * @param a
     * @param b
     * @return integer
     */

    static int sub(int a,int b){
        return a-b;
    }

    /**
     *
     * @param s
     * @return string
     * the uppercase of the string
     */
    static String upper(String s){
        return s.toUpperCase();
    }

    /**
     * @see public
     * @param a
     * @param b
     * @return integer
     */
    public static int multiply(int a,int b){
        return a*b;
    }
}
