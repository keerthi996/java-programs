//Finding duplicate elements
import java.util.*;
class FirstRepeating{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println(a[i]);
                break;
            }
        }
    }
}