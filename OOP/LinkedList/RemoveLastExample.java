import java.util.LinkedList;

public class RemoveLastExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);

        list.removeLast();

        System.out.println(list);
    }
}
