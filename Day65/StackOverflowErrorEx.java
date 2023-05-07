//Stack  over flow error is a runtime error
public class StackOverflowErrorEx {
    static void print(){
        System.out.println("Hello");
        print();//Here the method print is called infinite times...hence it gives stack overflow error
    }
    public static void main(String[] args){
        print();
    }
}
