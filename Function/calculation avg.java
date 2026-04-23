import java.util.Scanner;

public class Avgnumber {
    
    // Function to calculate average
    public static int calculationavg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        // Calling the function
        int avg = calculationavg(a, b, c);

        System.out.println("The average of three numbers is: " + avg);

        sc.close();
    }
}
