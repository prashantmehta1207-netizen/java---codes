class GenericMethodDemo {

    // Generic Method
    public static <T> void display(T data) {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {

        display(10);          // Integer
        display("Hello");     // String
        display(5.5);         // Double
    }
}
