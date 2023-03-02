import java.util.*;
class PrimeNum{
    public static int isPrime(int num){
        int count=0;
        if(num<=1){
            return 0;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count=1;
            }
        }
        if(count==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}