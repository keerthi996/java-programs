//count number of zeroes positive numbers and negatives
import java.util.*;
class CountNegZeroPos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int zeroes=0;
        int negatives=0;
        int positives=0;
        char ch;
        do{
            System.out.println("Enter number:");
            n=sc.nextInt();
            if(n==0){
                zeroes++;
            }
            else if(n<0){
                negatives++;
            }
            else{
                positives++;
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
        System.out.println(" number of Postive numbers are:"+positives);
        System.out.println(" number of Negative numbers are:"+negatives);
        System.out.println(" number of Zeroes are:"+zeroes);
    }
}