package practice;

public class Logical {
    public static void main(String[] args) {
        int X = 5;
        int Y = 62;

        boolean result = X < Y && Y > X;
        System.out.println(result);

        int x = 43;
        int f = 21;

        result = x > 50 || f > 50;
        System.out.println(result);

        int g = 1;
        int h = 31;
        result = !(g < 5 && h<50);
        System.out.println(result);
    }
}
