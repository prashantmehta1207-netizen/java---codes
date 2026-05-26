import java.util.ArrayList;

public class SetExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("C");
        list.add("C++");

        list.set(1, "Java");

        System.out.println(list);
    }
}
