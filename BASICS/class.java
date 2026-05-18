class Student {

    int id = 101;
    String name = "Prashant";

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
    }
}
