class Demo3 {

    // Method to calculate square of a number
    static int square(int n) {
        return n * n;
    }

    // Main method - entry point of program
    public static void main(String[] args) {

        int number = 4;

        // Calling method
        int result = square(number);

        // Printing result
        System.out.println("Number = " + number);
        System.out.println("Square = " + result);
    }
}
