import java.util.*;
class Union{
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int b[]={9,4,5,6};
        int[] c=new int[a.length+b.length];
        int i=0;
        for(i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            boolean exist=false;
            for(int k=0;k<a.length;k++){
                if(b[j]==a[k]){
                   exist=true;
                }
            }
            if(!exist){
                c[i++]=b[j];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}