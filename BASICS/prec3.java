import java.util.Scanner;

public class prec3 {
    public static void main(String[] args) {
        // areth metic opretors

        Scanner input = new Scanner(System.in);

        System.out.println("enter the nuber of a and b:");
        int a = input.nextInt();

        // System.out.println("enter the nuber of b:");
        int b = input.nextInt();

        System.out.println("addition =" + (a + b));
        System.out.println("Subtraction =" + (a - b));
        System.out.println("Multiplication =" + (a * b));
        System.out.println("Division =" + (a / b));
        System.out.println("Remainder =" + (a % b));

    }
}
