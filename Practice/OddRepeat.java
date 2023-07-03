/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OddRepeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int s=sc.nextInt();
		    int firstNSum=0;
            int odd=-1;
		    for(int j=0;j<n;j++){
		        odd=odd+2;
                firstNSum=firstNSum+odd;
                
		    }
		    int remSum=s-firstNSum;
		    
		    System.out.println(remSum/(k-1));
            
            
		}
	}
}
