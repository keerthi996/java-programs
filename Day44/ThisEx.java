//if the local variables and instance variables are same then we neeed to use this keyword in constructor
class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
class ThisEx{
    public static void main(String args[]){
        Student s=new Student("Keerthi",16);
        s.display();
    }
}
