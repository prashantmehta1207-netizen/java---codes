import java.util.HashMap;

public class HashMapDemo4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        map.remove(1);

        System.out.println(map);
    }
}
