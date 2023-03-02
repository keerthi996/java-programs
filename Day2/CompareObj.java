class CompareObj{
    public static void main(String args[]){
        Double d=new Double(123.456789);
        Long l=new Long(123456);
        if(d.equals(l)){
            System.out.println("YES they are equal");
        }
        else{
            System.out.println("No they are not equal");
        }
    }
}