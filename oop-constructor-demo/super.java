class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // parent method call
        System.out.println("Dog barks");
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
