public class Student implements DepartmentOfCmCs{
    public static void main(String[] args){
        Student s=new Student();
        s.hiDept();
        s.hiMba();
        s.hiMca();
    }
    @Override
    public void hiDept(){
        System.out.println("Hi...department");
    }
    public void hiMca(){
        System.out.println("Hi...MCA");
    }
    public void hiMba(){
        System.out.println("Hi...MBA");
    }

}

