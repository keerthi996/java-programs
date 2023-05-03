import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        try{
            a=sc.nextInt();
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            int b=a/0;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
