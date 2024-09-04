package practice;

public class operator {
    public static void main(String[] args) {
        int X = 40;
        System.out.println(X);
       int M = ++X; // prefix increment
        System.out.println(M);
        System.out.println(X);

        int Y = 30;
        System.out.println(Y);
       int z = Y++; //postfix increment
        System.out.println(z);
        System.out.println(Y);
    }
}
