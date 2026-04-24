import java.util.Scanner;

public class GreaterNumber {
    public static int calculationgreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter a number :");
        int b = sc.nextInt();
        int result = calculationgreater(a, b);
        System.out.println("The greater number is : " + result);
    }
}
