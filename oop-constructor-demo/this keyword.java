class Student {
    int roll;
    String name;

    // constructor
    Student(int r, String n) {
        this.roll = r;
        this.name = n;
    }

    // display
    void display() {
        System.out.println(roll + " " + name);
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        Student S1 = new Student(101, "Prashant");
        Student S2 = new Student(102, "Neha");

        S1.display();
        S2.display();
    }
}
