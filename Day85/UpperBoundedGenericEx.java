class UpperBoundedGenericEx{
    public static void main(String[] args){
        int number=25;
        System.out.println(display(number));
    }
    public static<T extends Number> T display(T obj){
        return (T)obj;
    }
}