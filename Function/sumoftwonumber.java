import java.util.Scanner;

public class function {
    public static int calculationsum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter a number :");
        int b = sc.nextInt();

        int sum = calculationsum(a, b);
        System.out.println("the sum of two number " + sum);

    }

}
