/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    double l=Math.pow(2,c);
		    int max=function(0,a,b);
			int count=0;
		    for(int j=1;j<l;j++){
				int res=function(j,a,b);
				if(res>=max){
					max=res;
				}
			}
			for(int j=1;j<l;j++){
				int res=function(j,a,b);
				if(res==max){
					count++;
				}
			}

			System.out.println(max);
			System.out.println(count);
		    
		}
		
	}
	static int function(int x,int a,int b){
		int res=(b|x)-(a&x);
		return res;
	}
}
