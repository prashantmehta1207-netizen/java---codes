import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius of circle:");
        double radius = input.nextDouble();
        double area = radius * radius * 3.1415;

        if (radius >= 0) {

            System.out.println("The area for the circle of radius " +
                    radius + " is " + area);
        } else {
            System.out.println("Negative input");
        }
    }
}
