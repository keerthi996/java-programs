import java.util.*;
class BunnyEars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
       int total= bunnyEars(n);
       System.out.println(total);
    }
    static int bunnyEars(int n){
        if(n==0)
        return 0;
        return 2+bunnyEars(n-1);
    }
}
