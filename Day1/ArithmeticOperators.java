import java.util.*;
class ArithmeticOperators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Arithmetic operators");
System.out.println("1.Addition");
System.out.println("2.Substraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Modulo division");
System.out.println("Select any operation from above options");
int a=sc.nextInt();
switch(a){
    case 1:
                 System.out.println("enter two values for addition");
                 int x=sc.nextInt();
                 int y=sc.nextInt();
                 System.out.println("addition of two numbers is:"+(x+y));
                 break;
    case 2:
                 System.out.println("enter two values for substraction");
                 int p=sc.nextInt();
                 int q=sc.nextInt();
                 System.out.println("substraction of two numbers is:"+(p-q));
                 break;
    case 3:
                 System.out.println("enter two values for multiplication");
                 int s=sc.nextInt();
                 int t=sc.nextInt();
                 System.out.println("multiplication of two numbers is:"+(s*t));
                 break;
    case 4:
                 System.out.println("enter two values for division");
                 int i=sc.nextInt();
                 int j=sc.nextInt();
                 System.out.println("division of two numbers is:"+(i/j));
                 break;
    case 5:
                 System.out.println("enter two values for modulo division");
                 int u=sc.nextInt();
                 int v=sc.nextInt();
                 System.out.println("modulo division of two numbers is:"+(u%v));
                 break;
    default:
                 System.out.println("Invalid output");
                 break;
  }
  }
 }           

