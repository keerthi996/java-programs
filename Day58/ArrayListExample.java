import java.util.ArrayList;
class ArrayListExample{
    public static void main(String args[]){
        ArrayList<String> students=new ArrayList<>();
        students.add("Keerthi");
        students.add("Yashu");
        students.add("Harika");
        for(String s:students){
            System.out.println(s);
        }
        System.out.println(students.get(1));
        students.remove(1);
        for(String s:students){
            System.out.println(s);
        }
        System.out.println(students.contains("Yashu"));
        students.add(0,"Yashu");
        for(String s:students){
            System.out.println(s);
        }
        System.out.println(students.size());
        students.clear();
        System.out.println(students.size());
        



    }
}