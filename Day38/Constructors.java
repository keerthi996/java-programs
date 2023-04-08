//Constructor overloading
//Constructors are of two types default and parameterized constructors
class Students{
    int rollno;
    String name;
    Students(int r,String n){
        rollno=r;
        name=n;
    }
    public static void main(String args[]){
        Students s1=new Students(1,"Keerthi");
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        
    }
}