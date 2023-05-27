class PassOrFailEx{
    public static void main(String[] args){
        Exam<Integer> ex1=new Exam(87);
        ex1.print();
        System.out.println(isPass(ex1));

    }
    public static <T extends Comparable<T>> boolean isPass(Exam<T> exam) {
        T marks = exam.marks;
        return marks.compareTo((T) Integer.valueOf(35)) > 0;
    }
}
class Exam<E>{
    E marks;
    
    Exam(E marks){
        this.marks=marks;
        
    }
    public void print(){
        System.out.println(marks);
    }
    

}