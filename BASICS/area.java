import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = input.nextInt();

        System.out.println("enter the breadth");
        int breadth = input.nextInt();

        int area = length * breadth;
        int peramiter = 2 * (length + breadth);

        if (area > peramiter) {
            System.out.println("area is greter than peramiter :");
        }
        if (peramiter > area) {
            System.out.println(" peramiter is greter than area :");
        }
        if (area == peramiter) {
            System.out.println(" area and peramiter is same:");
        }

    }
}
