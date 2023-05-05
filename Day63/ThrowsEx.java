public class ThrowsEx {
    public static void main(String[] args)throws  ArithmeticException{
        try{
            System.out.println(div(10,2));
        }
        catch(Exception e){
            System.out.println("Exception handled here...");
        }
    }
    static int div(int a,int b)throws ArithmeticException{
        return a/b;
    }
}
