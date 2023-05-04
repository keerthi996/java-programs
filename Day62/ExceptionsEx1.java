import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsEx1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        try{
            int a=sc.nextInt();
            int b=a/sc.nextInt();
            System.out.println(arr[10]);

        }
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception occured");
        }
        catch(ArithmeticException ex){
            System.out.println("arithmetic exception occured");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
