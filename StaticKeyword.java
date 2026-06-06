class Student {
    static String college = "ABC College";

    void display() {
        System.out.println(college);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}