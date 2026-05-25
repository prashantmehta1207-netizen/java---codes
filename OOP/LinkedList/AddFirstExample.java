import java.util.LinkedList;

public class AddFirstExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.addFirst(10);

        // print

        System.out.println(list);

    }
}
