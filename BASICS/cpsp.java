import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the cost price:");
        int cp = input.nextInt();

        System.out.println("enter the selling price:");
        int sp = input.nextInt();

        if (sp > cp) {
            System.out.println(" your  profit is ");
            int profit = sp - cp;
            System.out.println(profit);
        } else {
            System.out.println("your lose is: ");
            System.out.println(cp - sp);
        }
    }
}
