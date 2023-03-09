//First three maximum elements
import java.util.Arrays;
class MaxThree{
    public static void main(String args[]){
        int[] a={12,3,15,8,15};
        
        int index=0;
            for(int k=0;k<3;k++){
                int max=Integer.MIN_VALUE;
                for(int i=0;i<a.length;i++){
                    if(a[i]>max){
                        max=a[i];
                        index=i;
                    }
                }
                System.out.println(max);
                int x=a[index];
                for(int j=0;j<a.length;j++){
                    if(a[j]==x){
                        a[j]=0;
                    }
                }
            }
    }
}