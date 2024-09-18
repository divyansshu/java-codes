package StringsHandling;

public class StringFormat {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        String s = String.format("My company name is: %s", str);
        //output is given up to 8 decimal places
        String str2 = String.format("My answer is %.8f", 47.65734);

        String str3 = String.format("My answer is %15.8f", 47.65734);

        System.out.println(s);
        System.out.println(str2);
        System.out.println(str3);



    }
}
