import java.util.*;
class BitAndShiftOperators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("1.Bitwise operators");
System.out.println("2.Shift operators");
System.out.println("Enter any aone value:");
int n=sc.nextInt();
switch(n){
     case 1:
        System.out.println("Enter two numbers to perform bitwise operations:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("1.Bitwise AND operator");
        System.out.println("2.Bitwise OR operator");
        System.out.println("3.Bitwise XOR operator");
        System.out.println("4.Bitwise complement operator");
        System.out.println("Select any one option");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("bitwise AND of "+x+" and "+y+" is "+(x&y));
                break;
            case 2:
                System.out.println("bitwise OR of "+x+" and "+y+" is "+(x|y));
                break;
            case 3:
                System.out.println("bitwise XOR of "+x+" and "+y+" is "+(x^y));
                break;
            case 4:
                System.out.println("bitwise OR of "+x+" is "+(~x));
                System.out.println("bitwise OR of "+y+" is "+(~y));
                break;
            default:
                System.out.println("Invalid Option");
                break;
           }
           break;
    case 2:
        System.out.println("1.Left shift Operator");
        System.out.println("1.Signed Right shift Operator");
        System.out.println("3.Unsigned Right shift operator");
        System.out.println("Select any one option");
        int b=sc.nextInt();
        switch(b){
           case 1:
              System.out.println("Enter number to perform shift operation");
              int p=sc.nextInt();
              System.out.println("Left shift the given number by 1:"+(p<<1));
              break;
           case 2:
              System.out.println("Enter number to perform shift operation");
              int q=sc.nextInt();
              System.out.println("Signed rigth shift of given number is:"+(q>>1));
              break;
           case 3:
              System.out.println("Enter number to perform shift operation");
              int r=sc.nextInt();
              System.out.println("UnSigned rigth shift of given number is:"+(r>>>1));
              break;
           default:
              System.out.println("Invalid Option");
              break;
           }
           break;
       }
    }
 }
    
              
        
