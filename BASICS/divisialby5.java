import java.util.Scanner;

public class divisial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :");

        int a = input.nextInt();

        if (a % 5 == 0) {
            System.out.println("the number is divisoin by 5:");
        } else {
            System.out.println("the number is not divisoin by 5:");
        }
    }

}
