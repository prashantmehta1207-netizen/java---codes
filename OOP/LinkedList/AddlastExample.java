import java.util.LinkedList;

public class AddLastExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.addLast(20);

        System.out.println(list);
    }
}
