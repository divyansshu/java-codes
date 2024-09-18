package StringsHandling;

public class StringJoin {
    public static void main(String[] args) {
        String s1 = String.join(",", "alpha", "beta", "gamma");
        System.out.println(s1);

        String s2 = String.join(" ", "alpha", "beta", "gamma");
        System.out.println(s2);

        String s3 = String.join("alpha", "beta", "gamma");
        System.out.println(s3);
    }


}
