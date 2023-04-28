class MethodsInEnum{
    enum Students{
        KEERTHI,
        YASHU,
        HARIKA;
        public void description(){
            System.out.println("Students of svu");
        }
    }
    public static void main(String args[]){
        Students s=Students.KEERTHI;
        s.description();
    }
}