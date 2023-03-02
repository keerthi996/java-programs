import java.util.*;
class CubeOFN{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(Math.pow(i,3));
        }
    }
}