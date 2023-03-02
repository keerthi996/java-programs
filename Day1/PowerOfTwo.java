import java.util.*;
class PowerOfTwo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int n=sc.nextInt();
int start=1;
while(start<=n){
if(n==start){
System.out.println("Yes");
return;
}
start<<=1;
}
System.out.println("NO");
}
}
