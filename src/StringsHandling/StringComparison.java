package StringsHandling;

public class StringComparison {
    public static void main(String[] args) {
                String s1 = "ABC def abc";
                String s2 = "efg abc def";
                System.out.println(s1.regionMatches(8, s2, 4, 3));
                System.out.println(s1.regionMatches(4, s2, 8, 3));
                System.out.println(s1.regionMatches(4, s2, 4, 3));
                System.out.println(s1.regionMatches(0, s2, 4, 3));

                //Overloaded method
                System.out.println(s1.regionMatches(true, 8, s2, 4, 3));

            }
}
