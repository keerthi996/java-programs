public class EqualsEx{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public EqualsEx(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        EqualsEx eql1 = new EqualsEx(1, "java");
        EqualsEx eql2 = new EqualsEx(2, "java");
        EqualsEx eql3 = new EqualsEx(2, "java");
        System.out.println(eql1.equals(eql2));
        System.out.println(eql1.equals(eql3));
        System.out.println(eql1.equals(eql1));
        System.out.println(eql2.equals(eql3));
    }
}