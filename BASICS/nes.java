import java.util.Scanner;

public class nes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number of A : ");
        int a = input.nextInt();

        System.out.println("enter the number of B : ");
        int b = input.nextInt();

        System.out.println("enter the number of C : ");
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("the A number is largest : ");
            } else {
                System.out.println("the c number is larggest : ");
            }
        } else {
            if (b > c) {
                System.out.println("the B number is largesr : ");
            } else {
                System.out.println("the c number is largest : ");
            }
        }

    }
}
