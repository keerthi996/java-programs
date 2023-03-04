//sum of even and odd numbers from entered numbers
import java.util.*;
class SumOfEvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        int even=0,odd=0;
        char ch;
        do{
            System.out.println("Enter number:")
            num=sc.nextInt();
            if(num%2==0){
                even+=num;
            }
            else{
                odd+=num;
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }
        while(ch=='y'|| ch=='Y');
        System.out.println("sum of even is:"+even);
        System.out.println("sum of odd is:"+odd);
    }
}