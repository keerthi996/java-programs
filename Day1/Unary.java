import java.util.*;
class Unary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("negative number of a is:"+(-a));
int b=a++;
System.out.println("value of b is:"+b);
System.out.println("post increment of a is:"+a);//Post increment
int c=++b;
System.out.println("value of c is:"+c);
System.out.println("pre increment of b is:"+b);//Pre increment
int d=c--;
System.out.println("value of d is:"+d);
System.out.println("post decrement of c is:"+c);//Post decrement
int e=--d;
System.out.println("value of e if:"+e);
System.out.println("pre decrement of d is:"+d);//Pre decrement
}
}

