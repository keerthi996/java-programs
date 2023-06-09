/*
 *Important Points regarding Varargs

    # Vararg Methods can also be overloaded, but overloading may lead to ambiguity.
    # Before JDK 5, variable length arguments could be handled in two ways: One was using overloading, other was using array argument.
    # There can be only one variable argument in a method.
    # Variable argument (Varargs) must be the last argument.
*/
class VarArgsEx2{
   public static void main(String[] args){
        fun(10,2,3,4,5);
        fun(true,false,true,true,true);
        fun(3.45f,5.67f,7.89f);
        //fun();//this is ambiguous
        //this is a method call with no parameters
   }
   static void fun(int...a){
        System.out.println("function with variable integer arguments");
   }
   static void fun(boolean...a){
        System.out.println("function with variable boolean arguments");
   }
   static void fun(float...a){
        System.out.println("function with variable float arguments");
   }

}