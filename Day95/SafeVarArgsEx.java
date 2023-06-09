/*Unsafe operation warnings come at the compile time whenever in our code we invoked the method which is having varargs i.e. variable number of arguments. The @SafeVarargs annotation can be used with method/constructor and method should be final or static. 

In JDK 9, JDK developers extended the use of @SafeVarargs annotation, now apart from the final or static method we can use @SafeVarargs annotation with private method also. This is because private methods cannot be overridden.
*/
import java.util.ArrayList;
import java.util.List;
  
public class SafeVarArgsEx{
  
    // print is a method with variable argument
    @SafeVarargs
    private void print(List... students)
    {
        for (List<String> s : students) {
            System.out.println(s);
        }
    }
    /*
        Note: SafeVarArgsEx.java uses unchecked or unsafe operations.
        Note: Recompile with -Xlint:unchecked for details.
    */
  
    public static void main(String[] args)
    {
        SafeVarArgsEx obj = new SafeVarArgsEx();
        List<String> list = new ArrayList<String>();
        list.add("Keerthi");
        list.add("Thankusha");
        obj.print(list);
    }
}

/*
    Here we have one method with varargs of type List. But here we did not mention the type 
    of data that List will store. Here compiler will warn you that I am not going to check your
    code. I am not going to check the values you will add to ArrayList are of any particular 
    type or not. That’s why it will throw unsafe operation warnings at the compile time.
    Here compiler wants to know the type like 
*/