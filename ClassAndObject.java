class Student {
    String name = "Kazi";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}