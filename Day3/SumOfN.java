import java.util.*;
class SumOfN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of entered "+n+"  numbers is: "+sum );
        System.out.println("Avg of entered "+n+" numbers is: "+(sum/n));
    }
}