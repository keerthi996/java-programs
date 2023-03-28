/*to find out the arithmetic progression
t1 = a1 
t2 = a1 + (2-1) * d 
t3 = a1 + (3-1) * d 
*/
import java.util.*;
import java.util.Arrays;
class AP{
    static int arithmetic(int t1,int n,int d){
        int res=t1+(n-1)*d;
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first term:");
        int t1=sc.nextInt();
        System.out.println("Enter common difference:");
        int d=sc.nextInt();
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=arithmetic(t1,i+1,d);
        }
        System.out.println(Arrays.toString(arr));
    

    }
}