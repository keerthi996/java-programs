import java.util.*;
class Powers{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter the exponent:");
        int e=sc.nextInt();
        
        System.out.println(pow(n,e));
    }
    static int pow(int n,int e){
        if (e==0||e==1)
        return n;
        return n*pow(n,e-1);
    }
}