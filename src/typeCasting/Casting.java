package typeCasting;

public class Casting {
    public static void main(String[] args) {

        //typeCasting
        // widening casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        //narrowing casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte

        //automatic casting : int to double
        int f = 10;
         double ff = f;
        System.out.println(f);
        System.out.println(ff);

        //manual casting : double to int
        double dd = 17.5d;
        int d = (int) dd;
        System.out.println(dd);
        System.out.println(d);



        int a = 66;
        char b = (char) a; //manual casting : int to char
        System.out.println(b);
    }
}
