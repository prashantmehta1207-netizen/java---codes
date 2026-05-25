import java.util.LinkedList;

public class GetLastExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);

        System.out.println(list.getLast());
    }
}
