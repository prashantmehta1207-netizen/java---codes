import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number :");
        int a = input.nextInt();

        if (a > 9 && a < 100) {
            System.out.println("the number is two digit: ");
        } else {
            System.out.println("the number is not Two digit: ");
        }
    }
}
