    // importing StringJoiner class  
    import java.util.StringJoiner;  
    public class StringJoinerEx {  
        public static void main(String[] args) {  
            StringJoiner students = new StringJoiner(",", "[", "]");    
            // Adding values to StringJoiner  
            students.add("Keerthi");  
            students.add("Yashu");  
            students.add("Harika");  
            students.add("Aishu");  
                      
            System.out.println(students);  
        }  
    }  