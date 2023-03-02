import java.util.*;
class Assignment{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
System.out.println("Assign a value to b");
int b=a;//Assignment operator
System.out.println("Value of b is:"+b);
System.out.println("increment the value of a by 2 using addition assignment operator  "+(a+=2));
System.out.println("decrement the value of a by 2 using substraction assignment operator  "+(a-=2));
System.out.println("multiply the value of a by 2 using multiplication assignment operator  "+(a*=2));
System.out.println("divide the value of a by 2 using division assignment operator  "+(a/=2));
System.out.println("modulo divide the value of a by 2 using modulo division assignment operator  "+(a%=2));
}
}

