// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {

    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
