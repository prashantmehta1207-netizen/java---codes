import java.util.Scanner;

public class circumference {
    public static double calculationcircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double result = calculationcircumference(radius);
        System.out.println("The circumference of the circle is: " + result);
    }
}
