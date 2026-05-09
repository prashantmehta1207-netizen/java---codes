import java.util.Scanner;

public class threeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number A: ");
        int a = input.nextInt();

        System.out.println("enter the number B: ");
        int b = input.nextInt();

        System.out.println("enter the number C: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The a is largger number :");
        } else if (b >= a && b >= c) {
            System.out.println("The b is largger number :");
        } else {
            System.out.println("The c is largger number :");
        }

    }
}
