import java.util.*;
class Logical{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
System.out.println("a is greater");//Logical And
if(a>b|| b<a)
System.out.println("a is greater");//Logical Or
System.out.println("a is not equal to b"+!(a==b));//Logical Not
}
}

