// super keyword example using constructor and method
class Animal {
    int x = 10;

    Animal() {
        System.out.println("Animal Constructor");
    }

    void show() {
        System.out.println("Animal method");
    }
}

class Dog extends Animal {
    int x = 20;

    Dog() {
        super(); // calls parent constructor
        System.out.println("Dog Constructor");
    }

    void display() {
        System.out.println(super.x); // parent variable
        super.show();               // parent method
    }
}

public class Main_2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
