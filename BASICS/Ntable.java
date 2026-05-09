import java.util.Scanner;

public class Ntable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = input.nextInt();

        // // using for loop

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n + " * " + i + " = " + (n * i));
        // }
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // int fact = 1;
        // // using for loop

        // for (int i = 1; i <= n; i++) {
        // fact = fact * i;
        // }
        // System.out.println(fact);

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.print(i + " ");
        // }
        // }

        // Check whether a number is prime or not using a for loop.

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("the number is prime : ");
        } else {
            System.out.println("the number is not  prime : ");
        }

    }
}
