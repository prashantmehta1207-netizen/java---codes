import java.util.Scanner;

public class Avgnumber {
    public static int calculationavg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter a number :");
        int b = sc.nextInt();
        System.out.println("Enter a number :");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("the average of three numbers " + avg);
        sc.close();
    }
}
