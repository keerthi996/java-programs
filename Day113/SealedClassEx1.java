public class SealedClassEx1 {
    public static void main(String[] args) {
        Physics p = new Physics();
        p.property();
        Maths m= new Maths();
        m.property();
    }
}
sealed class Subject {
    void property() {
        System.out.println("all subjects");
    }
}
non-sealed class Physics extends Subject{
    void property(){
        System.out.println("this is physics");
    }

}
final class Maths extends  Subject {
    void property() {
        System.out.println("Maths only");
    }

}
