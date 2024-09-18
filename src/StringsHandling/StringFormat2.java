package StringsHandling;

public class StringFormat2 {
    public static void main(String[] args) {
        String str1 = "GFG";
        String str2 = "GeeksforGeeks";

        //%1$s represents first argument
        //%2$s represents second argument
        String str = String.format("My company name " + " is: %1$s, %1$s and %2$s ", str1, str2);

        System.out.println(str);


    }
}
