class Student {
    int roll;
    String name;
    static String college = "GTU";

    // static method
    static void changeCollege() {
        college = "SAL College";
    }

    // constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        // calling static method without object
        Student.changeCollege();

        Student s1 = new Student(101, "Prashant");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}
