import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
    public static void main(String[] args){
        HashSet<Students> set=new HashSet<Students>();
        Students s1=new Students();
        s1.setName("Keerthi");
        s1.setAge(22);
        Students s2=new Students();
        s2.setName("Thanusha");
        s2.setAge(21);
        Students s3=new Students();
        s3.setName("Gayatri");
        s3.setAge(23);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        Iterator<Students> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Students{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
