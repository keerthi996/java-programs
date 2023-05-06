class ClassNotFoundExceptionEx{
    public static void main(String[] args){

        System.out.println("hello");


        try {

            Class.forName("World");
        }
        catch(ClassNotFoundException e) {

            e.printStackTrace(); // class not found then throws class not found exception
        }

    }
}
