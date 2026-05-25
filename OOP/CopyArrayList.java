import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {

        // First ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");

        // Second ArrayList
        ArrayList<String> list2 = new ArrayList<>();

        // Copy elements from list1 to list2
        list2.addAll(list1);

        // Print both lists
        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);
    }
}

// output 
// First ArrayList: [Apple, Banana, Mango]
// Second ArrayList: [Apple, Banana, Mango]
