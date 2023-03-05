/*
          1                    0c0
         1 1                 1c0 1c1
        1 2 1              2c0 2c1 2c2
       1 3 3 1           3c0 3c1 3c2 3c3
      1 4 6 4 1        4c0 4c1 4c2 4c3 4c4
     1 5 10105 1     5c0 5c1 5c2 5c3 5c4 5c5
    1 6 1520156 1  6c0 6c1 6c2 6c3 6c4 6c5 6c6
*/
// THE ABOVE PATTERN REPRESENTS PASCALS TRIANGLE
//FORMULA FOR ncr IS n!/(n-r)!r!
import java.util.*;
class Pattern3{
    static int fact(int n){
        int fact=1;
        if(n==0){
            return fact;
        }
        else{
            fact=n*fact(n-1);
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int num;
        for(int i=1,f=0;i<=n;i++,f++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                num=fact(f)/(fact(f-k)*fact(k));
                System.out.print(num+" ");
            }
            
            System.out.println();
        }
    }
}