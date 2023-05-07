public class CustomRuntimeExceptionEx {
    public static void main(String[] args){
        Gender g=new Gender();
        try{
            g.setGender("Malee");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("enter valid gender");
        }
        System.out.println("Welcome...");

    }
}
class Gender{
    private String gender;
    void setGender(String gender)throws IllegalGenderException{
        if(gender.equals("Male")||gender.equals("Female")){
            System.out.println("valid");
        }
        else{
            throw new IllegalGenderException("Gender is invalid");
        }
    }
    String getGender(){
        return gender;
    }
}
class IllegalGenderException extends Exception{
    public IllegalGenderException(String s){
        super(s);
    }
}

