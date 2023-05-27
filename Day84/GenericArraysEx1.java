import java.util.Arrays;
class GenericArraysEx1{
    public static void main(String[] args){
        Students<String> s1=new Students(3);
        s1.set(0,"Keerthi");
        s1.set(1,"Thanusha");
        s1.set(2,"Shashank");
        System.out.println(s1.toString());
        System.out.println(s1.get(0));
    }
}
class Students<T>{
    Object[] student;
    Students(int size){
        student=new Object[size];
    }
    public T get(int index){
        return (T) student[index];
    }
    public void set(int index,T objects){
        student[index]=objects;
    }
    @Override
    public String toString(){
        return Arrays.toString(student);
    }
}