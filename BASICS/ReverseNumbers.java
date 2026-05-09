import java.util.Scanner;

public class ReverseNumbers {

    // Method to reverse the array
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Main method (test program)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Invoke reverse method
        reverse(numbers);

        // Display reversed numbers
        System.out.println("Reversed numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}