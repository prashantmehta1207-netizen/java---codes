class Student {
    int id;
    String name;

    // constructor using this keyword
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Prashant");
        s1.display();
    }
}
