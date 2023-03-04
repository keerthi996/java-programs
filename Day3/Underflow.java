//write  a program on Underflow in java
//underflow occurs when we assign such a value to a variable which is less than the minimum permissible value that time it hsppens.
public class Underflow
{
public static void main(String args[])
{
Byte a=-128;
a--;
System.out.println(a);
}
}