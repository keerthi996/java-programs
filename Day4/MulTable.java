import java.util.*;
class MulTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter  positive number:");
            num=sc.nextInt();
        }
        while(num<=0);
        for(int i=0;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }   
}