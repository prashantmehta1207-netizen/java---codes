class Demo5 {

    // Method with 2 parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters (Method Overloading)
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Main method
    public static void main(String[] args) {

        // Calling first method
        int result1 = add(2, 3);
        System.out.println("Sum of 2 numbers: " + result1);

        // Calling overloaded method
        int result2 = add(2, 3, 4);
        System.out.println("Sum of 3 numbers: " + result2);
    }
}
