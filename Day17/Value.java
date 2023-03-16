//passing value means passing primitive datatypes
class Value{
    public static void main(String args[]){
        int n=20;
        System.out.println(n);
        increment(n);
        System.out.println(n);
    }
    static void increment(int n){
        n++;
        System.out.println(n);
    }
}