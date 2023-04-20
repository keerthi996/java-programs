/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Colors
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s=sc.next();
		    int x=0;
		    int y=0;
		    for(int j=0;j<s.length();j++){
		        if(s.charAt(j)=='a'){
		            x++;
		        }
		        else{
                    y++;
                }
		    }
		    if(x<y){
		        System.out.println(x);
		    }
		    else{
		        System.out.println(y);
		    }
		}
	}
}
