public class ClonableMethod implements Cloneable {
    private int rno;
    private String sname;
    public int getrno() {
        return rno;
    }
    public void setrno(int rno) {
        this.rno = rno;
    }
    public String getSName() {
        return sname;
    }
    public void setSName(String sname) {
        this.sname = sname;
    }
    public ClonableMethod(int rno, String sname) {
        super();
        this.rno = rno;
        this.sname = sname;
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        ClonableMethod cm = new ClonableMethod(1, "hello");

        ClonableMethod cm1 = (ClonableMethod) cm.clone();

        cm.setSName("hi");

        System.out.println(cm.getrno()+" "+cm.getSName());

        System.out.println(cm1.getrno()+" "+cm1.getSName()); // updates will not be effected on the clone method.
    }
}