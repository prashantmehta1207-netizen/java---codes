import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbe : ");
        int n = input.nextInt();

        if (n > 99 && n < 999) {
            System.out.println("the number is three digit: ");
        } else {
            System.out.println("the number is not  three digit: ");
        }
    }
}
