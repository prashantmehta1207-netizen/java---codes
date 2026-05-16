class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Program Continues");
    }
}
