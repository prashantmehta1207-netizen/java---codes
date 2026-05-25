import java.util.LinkedList;

public class ContainsExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
      
// contains() check kare che ke "Java" list ma che ke nai.
// Jo hoy → true
// Jo na hoy → false
      
        System.out.println(list.contains("Java"));
    }
}
