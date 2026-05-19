final class Test {
    
    // final variable
    final int x = 10;

    // final method
    final void display() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
