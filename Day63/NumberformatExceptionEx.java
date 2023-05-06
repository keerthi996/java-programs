public class NumberformatExceptionEx {
    public static void main(String[] args){

        try{
            int a=Integer.parseInt("Hello");
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
