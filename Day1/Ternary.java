import java.util.*;
class Ternary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter ur age");
int age=sc.nextInt();
int eligibility=age>18?1:0;
if(eligibility==1)
System.out.println("You are eligible");
else
System.out.println("You are not eligible");
}
}
