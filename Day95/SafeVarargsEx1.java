import java.util.ArrayList;
import java.util.List;

class SafeVarargsEx1<T>{
    public static void  main(String[] args){
        
        SafeVarargsEx1 s=new SafeVarargsEx1();
        s.fun("Keerthi","Thanusha","Shashank");
        System.out.println(s.students);
    }
    private List<T> students = new ArrayList<>();
  
    @SafeVarargs
    public final void fun(T... add){
        for(T l:add){
            students.add(l);
        }
    }
}