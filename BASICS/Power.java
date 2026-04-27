import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 2, power = 3;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
    }
}
