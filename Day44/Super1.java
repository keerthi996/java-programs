//super keyword in java
//super keyword is used to access methods variables from parent class
class Animal{
  void ani(){
    System.out.println("Animals....");
  }
}
class Dog extends Animal{
  void dogs(){
    super.ani();
    System.out.println("Dogs....");
  }
}
class Super1{
  public static void main(String args[]) {
    Dog d=new Dog();
    d.dogs();
    
  }
}