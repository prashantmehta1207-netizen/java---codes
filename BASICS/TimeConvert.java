import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds = " +
                minutes + " minutes and " +
                remainingSeconds + " seconds");
    }
}
