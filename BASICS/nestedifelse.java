import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number : ");
        int n = input.nextInt();

        if (n % 5 == 0 || n % 3 == 0) {
            if (n % 15 != 0) {
                System.out.println("the number is divison by 5 or 3 both but not 15: ");
            } else {
                System.out.println("Not maching the requir ment condition :");

            }

        } else {
            System.out.println("Not maching the requir ment condition :");
        }

    }
}
