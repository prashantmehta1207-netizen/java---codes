class Box<T> {

    T value;

    // Constructor
    Box(T value) {
        this.value = value;
    }

    // Method
    void show() {
        System.out.println("Value: " + value);
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {

        Box<Integer> obj1 = new Box<>(100);
        obj1.show();

        Box<String> obj2 = new Box<>("Java");
        obj2.show();
    }
}
