public class OopUsage {
    public static void main(String[] args){
        Mobile m1=new Mobile();
        m1.setBattery(60000);
        m1.setRam(4);
        m1.setBrand("Vivo");
        m1.setType(Type.ANDROID);
        System.out.println(m1.toString());


        Student s1=new Student();
        s1.setName("Keerthi");
        s1.setGender(Gender.FEMALE);
        s1.setCollege("SV University");
        s1.setCourse("MCA");
        s1.setGraduationType(GraduationType.FULLTIME);
        s1.setStandard("Second");
        s1.setRollNo(16);
        s1.setGrade('B');


        Marks m=new Marks();
        m.setMarks1(67);
        m.setMarks2(87);
        m.setMarks3(85);
        m.calculateTotalMarks();

        
        s1.setMarks(m);
        System.out.println(s1);


        s1.intro(s1);

        if(s1 instanceof Life){
            System.out.println("I am Human");
        }
    }
}
