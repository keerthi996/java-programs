import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=0;
        int[] arr=new int[5];
        try{
            int a=sc.nextInt();
            start=start+1;
            int b=a/sc.nextInt();
            start=start+1;
            System.out.println(arr[10]);

        }
        catch(ArithmeticException |InputMismatchException |ArrayIndexOutOfBoundsException e){
            if(start==0){
                System.out.println("Input mismatch exception");
            }
            else if(start==1){
                System.out.println("Arithmetic exception");
            }
            else{
                System.out.println("Array index out of bounds exception");
            }
        }
    }
}
