class SuppressWarningsEx1{
    public static void main(String[] args){
        @SuppressWarnings("unused")
        int x=10;//here x is not used ...compiler gives variable not used warning to suppress the warning we use SupppressWarnings annotation 
        System.out.println("Hello");
    }
}