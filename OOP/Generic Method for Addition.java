class Demo {

    // Generic Method
    public static <T> void show(T a, T b) {

        System.out.println("First = " + a);
        System.out.println("Second = " + b);
    }

    public static void main(String[] args) {

        show(10, 20);

        show("Hello", "Java");
    }
}
