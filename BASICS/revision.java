import java.util.Scanner;

public class revision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number:");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }
}
