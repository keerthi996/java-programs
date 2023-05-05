public class ThrowEx {
    public static void main(String[] args){
        try{
            System.out.println(div(10,0));
        }
        catch (Exception e){
            System.out.println("Exception handled here...");
        }
        System.out.println("Hello");

    }
    static int  div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Exception raised");
        }
        return a/b;
    }
}
