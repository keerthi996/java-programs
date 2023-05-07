//class cast exception is a runtime exception or unchecked exception
public class ClassCastExceptionEx {
    public static void main(String[] args){
        Rbi r=new Rbi();
        r.desc();
        try{
            Sbi s=(Sbi)r;//Here we are trying to cast the object of one class to another class
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
class Rbi{
    void desc() {
        System.out.println("subsidary of RBI");
    }
}
class Sbi extends Rbi{
    void description(){
        desc();
        System.out.println("largest public sector bank of India");
    }
}
