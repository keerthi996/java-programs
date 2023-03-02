import java.util.*;
class Pow2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter  a Number:");
int n=sc.nextInt();
int count=0;
int flag=1;
for(int i=0;i<31;i++){
if((n&flag)!=0)
count++;
flag<<=1;
}
if(count==1)
System.out.println("it is power of 2");
else
System.out.println("it is not a power of 2");
}
}
