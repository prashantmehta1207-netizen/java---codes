// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat(); // inherited from Animal
        d.bark();

        c.eat(); // inherited from Animal
        c.meow();
    }
}
