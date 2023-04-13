//super keyword to use variables of parent class
class Student{
    String clg="SV University";
}
class Student1 extends Student{
    String name="Keerthi";
    void details(){
        System.out.println(name);
        System.out.println(super.clg);
    }

    
}
class Super2{
    public static void main(String args[]){
        Student1 s1=new Student1();
        s1.details();
    }
}