import java.util.ArrayList;

public class ClearExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");

        list.clear();

        System.out.println(list);
    }
}
