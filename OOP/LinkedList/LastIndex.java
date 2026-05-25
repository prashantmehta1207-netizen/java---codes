import java.util.LinkedList;

public class LastIndexExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        System.out.println(list.lastIndexOf("Apple"));
    }
}
