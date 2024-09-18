package StringsHandling;

public class StringConstructors {
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        String s1 = new String(); //empty string
        String s2 = new String(ch); //string initialized by an array of characters
        String s3 = new String(ch ,1 ,3); //sub range of character array

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
