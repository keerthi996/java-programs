import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalBlock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();

        }
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception occured");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
