public class InfiniteLoop {
    public static void calculationinfinite(int a) {
        do {
            System.out.println("the number is " + a);
        } while (true); // infinite loop
    }

    public static void main(String[] args) {
        calculationinfinite(5);
    }
}
