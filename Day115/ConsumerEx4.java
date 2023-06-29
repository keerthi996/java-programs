import java.util.function.*;
class ConsumerEx4{
    public static void main(String[] args){
        String[] names = {"Keerthi","Thanusha","Shashank","Aishu"};
        Consumer<String> printNames=System.out::println;
        for(String name:names){
            printNames.accept(name);
        }

    }
}