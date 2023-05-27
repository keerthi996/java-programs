//Generics for Arrays
import java.util.Arrays;
class GenericArrays{
    public static void main(String[] args){
        Marks<String> m1=new Marks(5);
        m1.set(0,"Keerthi");
        m1.set(1,"Thanusha");
        m1.set(2,"Shashank");
        System.out.println(m1.toString());

        Marks<Integer> m2=new Marks(3);
        m2.set(0,13);
        m2.set(1,15);
        m2.set(2,23);
        System.out.println(m2.toString());
    }
}
class Marks<T>{
    private Object[] marks;
    Marks(int size)
	{
		marks = new Object[size];
	}	
    public T get(int index){
        return (T) marks[index];
    }
    public void set(int index,T element){
        marks[index]=element;
    }
    @Override
    public String toString()
	{
        return Arrays.toString(marks);
    }

}
