class Student{
    int rollno;
    String name;
    public Student(int num,String name){
        this.rollno=num;
        this.name=name;
    }

}
class Stud{
    public static void main(String args[]){
        Student s1=new Student(1,"keerthi");
        Student s2=new Student(2,"Harika");
        if(s1.equals(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}