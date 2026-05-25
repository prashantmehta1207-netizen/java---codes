import java.util.LinkedList;

public class IndexOfExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");

        System.out.println(list.indexOf("Banana"));
    }
}
