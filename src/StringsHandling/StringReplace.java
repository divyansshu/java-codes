package StringsHandling;

public class StringReplace {
    public static void main(String[] args) {
        String s1 = "ClaSses";
        String s2 = s1.replace('s', 'c'); //replaces all occurrences of a character
        System.out.println(s2);

        String s3 = "Hello UPES";
        String s4 = s3.replace("Hello", "WoW"); //replaces one substring with another string
        System.out.println(s4);


    }
}
