public class Student  extends Human implements Life{
    private String name;
    private Gender gender;
    private String college;
    private String course;

    private String Standard;
    private GraduationType graduationType;
    private int rollNo;
    private char grade;
    private Marks marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public GraduationType getGraduationType() {
        return graduationType;
    }

    public void setGraduationType(GraduationType graduationType) {
        this.graduationType = graduationType;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", Standard='" + Standard + '\'' +
                ", graduationType=" + graduationType +
                ", rollNo=" + rollNo +
                ", grade=" + grade +
                ", marks=" + marks +
                '}';
    }
}
enum Gender{
    FEMALE,MALE;
}
enum GraduationType{
    DISTANCE,FULLTIME;
}
