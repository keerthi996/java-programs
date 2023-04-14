//interfaces are used to implement multiple classes in java
//Interfaces are used for 100% abstraction as compared to abstract classes
//By default compiler adds abstract and public keywords before methods declared in interfaces
interface BankInterstRates{
    float rateOfInterest();
}
interface HeadQuarters{
    String hq();
}
class Sbi implements BankInterstRates,HeadQuarters{
    public float rateOfInterest(){
        return 3.56f;
    }
    public String hq(){
        return "Mumbai";
    }
    
}
class Pnb implements BankInterstRates,HeadQuarters{
    public float rateOfInterest(){
        return 4.56f;
    }
    public String hq(){
        return "Delhi";
    }

}
class Interface1{
    public static void main(String args[]){
        Sbi s=new Sbi();
        System.out.println(s.rateOfInterest());
        System.out.println(s.hq());
        Pnb p=new Pnb();
        System.out.println(p.rateOfInterest());
        System.out.println(p.hq());
    }
}