import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int rem=x%10;
		    int roundedNum=0;
		    if(rem<5){
		        roundedNum=x-rem;
		    }
		    else{
		        roundedNum=x+(10-rem);
		    }
		    System.out.println(100-roundedNum);
		}
	}
}
