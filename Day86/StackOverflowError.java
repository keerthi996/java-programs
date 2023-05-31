/*This happens when a method calls itself recursively or when there is a deep chain of method 
    calls, causing the stack to fill up with method frames and eventually run out of space.
*/
class StackOverflowError{
    public static void main(String[] args){
        print();
    }
    public static void print(){
            print();
    }
}

