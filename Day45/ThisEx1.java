//this method is used to invoke current class methods also
class Student{
    String name;
    int rollno;
    Student(){
        System.out.println("Student of svu");
    }
    Student(String name,int rollno){
        this();
        this.name=name;
        this.rollno=rollno;
        System.out.println("name:"+name+ " and  rollno is:"+rollno);
    }
}
class ThisEx1{
    public static void main(String args[]){
        Student s1=new Student("Keerthi",10);


    }
}