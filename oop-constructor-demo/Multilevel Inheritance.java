// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class
class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby Dog is weeping");
    }
}

// main class
public class Constructor {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();

        b.eat(); // from Animal
        b.bark(); // from Dog
        b.weep(); // from BabyDog
    }
}
