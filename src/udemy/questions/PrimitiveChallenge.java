package udemy.questions;

public class PrimitiveChallenge {

    public static void main(String[] args) {

        int intVal1 = 10;
        byte byteVal2 = 20;
        short shortVal3 = 50;
        long sum = 50000L + 10L * (intVal1 + byteVal2 + shortVal3);
        System.out.println(sum);

        short shortSum = (short) (1000 + 10 * (intVal1 + byteVal2 + shortVal3));
        System.out.println(shortSum);

        float floatValue = 5.25f;
        System.out.println(floatValue);

        double numOfPounds = 200;
        double numOfKilo = numOfPounds * 0.45359237;
        System.out.println(numOfKilo + "kg");

        char mySimpleChar = '?';
        System.out.println(mySimpleChar);
        char myDecimalChar = 63;
        System.out.println(myDecimalChar);
        char myUnicodeChar = '\u003F';
        System.out.println(myUnicodeChar);

        int myint = 10;

        String mystring = "20";

        System.out.println(myint + mystring);
    }
}
