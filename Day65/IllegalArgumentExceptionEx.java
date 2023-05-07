
public class IllegalArgumentExceptionEx{
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(-1);
    }
}
class Human {
    int age;

    void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {
            this.age = age;
        }
    }
}
