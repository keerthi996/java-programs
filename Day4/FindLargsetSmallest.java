//find largest and smallest number in entered numbers
import java.util.*;
class FindLargestSmallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        boolean flag=true;
        int min=0,max=0;
        char ch;
        do{
            if (flag){
                System.out.println("Enter number:");
                n=sc.nextInt();
                min=n;
                max=n;
                flag=false;
            }
            else{
                System.out.println("enter number:");
                n=sc.nextInt();
                if(n>max){
                    max=n;
                }
                if(n<min){
                    min=n;
                }
            }
            System.out.println("Do u want to continue?");
            ch=sc.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
        System.out.println("Minimum value is:"+min);
        System.out.println("Maximum value is:"+max);
    }
}