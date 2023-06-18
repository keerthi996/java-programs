enum Gender{

    MALE("This is male"),
    FEMALE("This is female");


    private final String studeGender;

    // private enum constructor
    private Gender(String gender) {
        this.studeGender = gender;
    }

    public  String getstudGender() {
        return studeGender;
    }
}

public class EnumWithConstructor {

    public static void main(String[] args) {

        Gender g=Gender.FEMALE;

        System.out.println(g.getstudGender());

    }
}
