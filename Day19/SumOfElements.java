/*a1={1,2,3,4}
  a2={4,5,6,7}
  result={5,8,0,1};
*/
import java.util.*;
import java.util.Arrays;
class SumOfElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements u want to enter in array1:");
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter elements of array1:");
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements u want to enter in array2:");
        int n2=sc.nextInt();
        int[] a2=new int[n2];
        System.out.println("Enter elements of array2:");
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        
        int length=n1>n2?n1:n2;
        int[] result=new int[length];
        int xl=0,sum=0,k=0;
        if(n1<n2){
            xl=n2-n1;
            for(int i=n1-1,j=n2-1;i>=0;i--,j--){
            sum=0;
            sum=a1[i]+a2[j]+k;
            result[length-1]=sum%10;
            k=sum/10;
            length--;

            }
            for(int i=xl-1;i>=0;i--){
                sum=0;
                sum=a2[i]+k;
                result[i]=sum%10;
                k=sum/10;

            }
        }
        else if(n2<n1){
            xl=n1-n2;
            for(int i=n1-1,j=n2-1;j>=0;i--,j--){
            sum=0;
            sum=a1[i]+a2[j]+k;
            result[length-1]=sum%10;
            k=sum/10;
            length--;
            }
            for(int i=xl-1;i>=0;i--){
                sum=0;
                sum=a1[i]+k;
                result[i]=sum%10;
                k=sum/10;
            }

        }
        else{
            for(int i=n1-1,j=n2-1;i>=0;i--,j--){
            sum=0;
            sum=a1[i]+a2[j]+k;
            result[length]=sum%10;
            k=sum/10;
            length--;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}