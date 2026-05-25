import java.util.LinkedList;

public class RemoveFirstExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);

        list.removeFirst();

        System.out.println(list);
    }
}
