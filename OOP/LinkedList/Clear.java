import java.util.LinkedList;

public class ClearExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);

        list.clear();

        System.out.println(list);
    }
}
