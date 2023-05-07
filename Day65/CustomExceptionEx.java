public class CustomExceptionEx {
    public static void main(String[] args){
        Person p=new Person();
        try{
            p.setAge(13);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("enter valid age");
        }
        System.out.println("Welcome...");

    }
}
class Person{
    private int age;
    void setAge(int age)throws IllegalAgeException{
        if(age<18){
            throw new IllegalAgeException("Age is invalid");
        }
        else{
            System.out.println("valid");
        }
    }
    int getAge(){
        return age;
    }
}
class IllegalAgeException extends Exception{
    public IllegalAgeException(String s){
        super(s);
    }
}
