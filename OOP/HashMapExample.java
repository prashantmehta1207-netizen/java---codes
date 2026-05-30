import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Display HashMap
        System.out.println("HashMap: " + map);

        // Access value
        System.out.println("Key 2: " + map.get(2));

        // Check key
        System.out.println("Contains key 1? " + map.containsKey(1));

        // Remove element
        map.remove(3);

        // Display all entries
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
