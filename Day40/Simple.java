//Method declared with protected acces specifier cannot be accessed outside the class but can be accessed in the inherited class
    class Protected{  
      protected void printMsg(){
        System.out.println("Hello java");
      }  
    }  
    public class Simple extends Protected {
     public static void main(String args[]){  
       Simple obj=new Simple();  
       obj.printMsg();  
       }  
    }  