class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void show() {
        System.out.println(first + " " + second);
    }
}

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> p1 =
                new Pair<>(1, "Java");

        p1.show();
    }
}
