package StringsHandling;

public class StringFormat3 {
    public static void main(String[] args) {
        String result = String.format("let's learn %s formatting in %s", "string", "java");
        System.out.println(result);

        result = String.format("%2$, 3.2f %1$s", "meters", 1260.5052);
        System.out.println(result);

        result = String.format("%3$c %2$c %1$c", 'a', 'b', 'c');
        System.out.println(result);

    }
}
