abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}