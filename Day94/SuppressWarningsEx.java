import java.util.*;  
class SuppressWarningsEx{  
@SuppressWarnings("unchecked")
public static void main(String args[]){  
ArrayList list=new ArrayList(); 
//Here, the @SuppressWarnings("unchecked") annotation is used to suppress unchecked conversion warnings.
// Although the code assigns a raw ArrayList to a generic List<String>, the annotation prevents the compiler from generating a warning. 
list.add("sonoo");  
list.add("vimal");  
list.add("ratan");  
  
for(Object obj:list)  
System.out.println(obj);  
  
}}  