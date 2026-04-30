abstract class Vehicle {
    abstract void start();   // abstract method

    void fuelType() {        // concrete method
        System.out.println("Petrol or Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}
