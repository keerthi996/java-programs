import java.util.*;
class CountSets{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter  a number:");
int n=sc.nextInt();
int flag=1;
int count=0;
for(int i=0;i<31;i++){
if((n&mask)!=0)
count++;
flag<<=1;
}
System.out.println(count);
}
}
