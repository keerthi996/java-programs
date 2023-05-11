public class HAshCodeEx {
    public static void main(String[] args){
        Student s=new Student();
        System.out.println(s.hashCode());

    }
}
class Student{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
