import java.util.*;

class Demo {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "Apple");
        lhm.put(2, "Banana");
        lhm.put(3, "Mango");

        System.out.println(lhm);
    }
}
