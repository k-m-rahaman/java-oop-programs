class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}