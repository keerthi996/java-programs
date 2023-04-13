/* a={4,14,2}
   4=0100
   14=1110
   2=0010

     (4,14)=2    0100 xor 1110  ----1010--2
     (14,2)=2    0010 xor 1110  ----1100--2
     (2,4)=2     0010 xor 0100  ----0110--2

*/
import java.util.*;
class HammingDistance{
    static int hammingDist(int m,int n){
        int res=m^n;
        return countSets(res);
    }
    static int countSets(int n){
        int mask=1;
        int count=0;
        for(int i=0;i<31;i++){
            if((n&mask)!=0){
                count++;
            }
            mask=mask<<1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array elements u want to enter:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                result=result+hammingDist(a[i],a[j]);
            }
        }
        System.out.println(result);
    }
    
}