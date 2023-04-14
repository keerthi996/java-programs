//abstract classes are used in abstraction
//We cannot create object for abstract classes
//classes with abstract methods must be declared as abstract
abstract class Bank{
    abstract double rateOfInterest();
}
class Sbi extends Bank{
    double rateOfInterest(){
        return 0.56;
    }
}
class Abstract1{
    public static void main(String args[]){
        Sbi s=new Sbi();
        System.out.println(s.rateOfInterest());
    }
}