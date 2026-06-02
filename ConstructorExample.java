class Car {
    String name;

    Car(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        c1.display();
    }
}