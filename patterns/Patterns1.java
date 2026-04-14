import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of n ");
        int n = sc.nextInt();

        System.out.println("enter the number of m ");
        int m = sc.nextInt();

        // outer .loop
        for (int i = 1; i <= n; i++) {
            // inner. loop
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
