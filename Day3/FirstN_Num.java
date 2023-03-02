import java.util.*;
class FirstN_Num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=0;
        while(i<(n+1)){
            System.out.println(i);
            i++;
        }
    }
}