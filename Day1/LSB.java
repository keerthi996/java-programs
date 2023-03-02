import java.util.*;
class LSB{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int n=sc.nextInt();
int mask=1;
if((n&mask)==1){
System.out.println("Set");
}
else{
System.out.println("Unset");
}
}
}

