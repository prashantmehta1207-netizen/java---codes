import java.util.Scanner;

public class prectic {
    public static void main(String[] args) {
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of circle:");

        double radius = input.nextDouble();
        double area = radius * radius * PI;

        System.out.println("the area of circle with radius:" + radius + " is " +
                area);
    }
}
