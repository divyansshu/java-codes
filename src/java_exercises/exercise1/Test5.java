package java_exercises.exercise1;

public class Test5 {

    public
    String str = "hello";

    public char[] reverse(String str) {


        char[] ch = str.toCharArray();
        int i = 0;
        char temp;
        int j = str.length()-1;

        while(j >= i) {

             temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
        return ch;
    }
    public static void main(String[] args) {

        Test5 obj = new Test5();
        System.out.println("Original String is "+obj.str);

        char[] rev = obj.reverse(obj.str);
        System.out.print("Reversed String is ");

        for(int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }

    }
}
