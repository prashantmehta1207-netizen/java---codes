import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n + "the number is perfect number:");
        } else {
            System.out.println(n + "the number is not  perfect number:");
        }
    }
}
