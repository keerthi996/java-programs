//Super keyword for using parent class constructor
class College{
    String clg;
    College(String clg){
        this.clg=clg;
    }
}
class Student extends College{
    String name;
    Student(String clg,String name){
        super(clg);
        this.name=name;
        
    }
    void print(){
        System.out.println(name);
        System.out.println(clg);
    }
}
class Super3{
    public static void main(String args[]){
        Student s=new Student("SVU","Keerthi");
        s.print();
    }
}
