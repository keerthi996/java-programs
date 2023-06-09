class VarArgsEx {
    // A method that takes variable
    // number of integer arguments.
    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                           + a.length);
 
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with
        // different number of parameters
       
        // one parameter
        fun(100);
           
          // four parameters
        fun(1, 2, 3, 4);
         
          // no parameter
          fun();
    }
}
/*
Erroneous Varargs Examples

Case 1: Specifying two Varargs in a single method: 

void method(String... gfg, int... q)
{
    // Compile time error as there 
    // are two varargs
}

Case 2: Specifying Varargs as the first parameter of the method instead of the last one: 

void method(int... gfg, String q)
{
    // Compile time error as vararg 
    // appear before normal argument
}
*/


