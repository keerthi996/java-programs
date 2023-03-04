//program to print armstrong numbers between 1 to 500
public class Armn{
    static boolean isArmstrong(int n){
        int last=0;
        int sum=0;
        int temp=n;
        while(n!=0){
            last=n%10;
            sum+=Math.pow(last,3);
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n=500;
        for(int i=1;i<=n;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}