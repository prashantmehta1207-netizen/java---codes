class StudentOverload {

    String name;
    int age;

    // Default Constructor
    StudentOverload() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor (1 parameter)
    StudentOverload(String n) {
        name = n;
        age = 0;
    }

    // Parameterized Constructor (2 parameters)
    StudentOverload(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        // Calling different constructors
        StudentOverload s1 = new StudentOverload();
        StudentOverload s2 = new StudentOverload("Prashant");
        StudentOverload s3 = new StudentOverload("Rahul", 20);

        // Display output
        s1.display();
        s2.display();
        s3.display();
    }
}
