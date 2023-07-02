/*

As you can see, the getType() method in the Car class returns "Car," and the getType() method
 in the Bike class returns "Bike," even though both methods are called through a reference of
  the superclass Vehicle. This behavior is possible due to covariant return types, which allow
 the method in the subclass to return a more specific type than the method in the superclass.

Covariant return types are especially useful when working with polymorphism, where you can 
handle objects of different subclasses through a common superclass reference without worrying 
about explicit type casting.

*/
class Vehicle {
    String getType() {
        return "Vehicle";
    }
}

class Car extends Vehicle {
    @Override
    String getType() {
        return "Car";
    }
}

class Bike extends Vehicle {
    @Override
    String getType() {
        return "Bike";
    }
}

public class CovariantEx {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle Type: " + vehicle.getType());

        Vehicle car = new Car();
        System.out.println("Car Type: " + car.getType());

        Vehicle bike = new Bike();
        System.out.println("Bike Type: " + bike.getType());
    }
}
