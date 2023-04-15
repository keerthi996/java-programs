//using static variables
class Student{
    static int income=10000;
    int collegeFee(int x){
        income=income-x;
        return income;
    }
    int stipend(int x){
        income=income+x;
        return income;
    }
    int foodExpenses(int x){
        income=income-x;
        return income;
    }
}
class StaticVar{
    public static void main(String args[]){
        Student s=new Student();
        s.collegeFee(2500);
        System.out.println(Student.income);
        s.stipend(1500);
        System.out.println(Student.income);
        s.foodExpenses(500);
        System.out.println(Student.income);
    }
}