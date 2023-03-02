import java.util.*;
class SumOfEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0,j=2;i<n;i++,j=j+2){
            sum=sum+(j);
        }
        System.out.println("sum of  first "+n+" even numbers is:"+sum);
    }
}