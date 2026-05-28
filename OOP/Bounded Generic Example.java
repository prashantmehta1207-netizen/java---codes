class Calculator {

    // Only Number type allowed
    public static <T extends Number> double square(T num) {

        return num.doubleValue() * num.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(square(5));
        System.out.println(square(2.5));
    }
}
