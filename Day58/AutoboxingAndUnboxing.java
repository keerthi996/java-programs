public class AutoboxingAndUnboxing {
    public static void main(String[] args){
	int a=80;  
 	Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
	Integer j=a;//autoboxing 
  
	System.out.println(a+" "+i+" "+j);  
	
  	Integer b=new Integer(9);    
	int x=b.intValue();//converting Integer to int explicitly  
	int y=b;//unboxing    
    
	System.out.println(b+" "+x+" "+y);    
    }
}
