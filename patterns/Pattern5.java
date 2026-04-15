import java.util.Scanner;

public class Patterns5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");

        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {
            // innere loop for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // star

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
