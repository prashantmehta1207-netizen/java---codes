class Test {

    // Generic Method
    public static <T> void printArray(T[] arr) {

        for (T element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] num = {1, 2, 3, 4};
        String[] str = {"Java", "Python", "C++"};

        printArray(num);
        printArray(str);
    }
}
