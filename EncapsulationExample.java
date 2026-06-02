class Person {
    private int age = 19;

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getAge());
    }
}