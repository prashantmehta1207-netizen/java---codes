import java.util.Scanner;

public class Productoftwonumber {
    public static int calculationproduct(int a, int b) {
        int product = a * b;
        return product;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter a number :");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("the product of two number " + product);
    }
}
