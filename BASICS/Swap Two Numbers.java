class Swap {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
