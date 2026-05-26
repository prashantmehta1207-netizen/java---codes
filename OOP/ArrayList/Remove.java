import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Mango");

        list.remove("Apple");

        System.out.println(list);
    }
}
