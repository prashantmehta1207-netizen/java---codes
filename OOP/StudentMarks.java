import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Prashant", 85);
        marks.put("Rahul", 90);
        marks.put("Amit", 78);

        System.out.println("Marks of Rahul: " + marks.get("Rahul"));

        for (String name : marks.keySet()) {
            System.out.println(name + " = " + marks.get(name));
        }
    }
}
