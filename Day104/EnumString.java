public class EnumString {
    public static void main(String[] args) {

        System.out.println(Gender.FEMALE.toString());

    }
}
enum Gender{
    MALE {


        public String toString() {

            return "This is male";

        }
    },

    FEMALE{


        public String toString() {

            return "This is female";

        }
    };
}