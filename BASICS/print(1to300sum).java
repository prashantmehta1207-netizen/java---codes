public class Sum1To300 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 300; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
