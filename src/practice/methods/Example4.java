package practice.methods;

public class Example4 {

    public static int findMaximum(int x, int y, int z) {
        if(x > y  && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        }else {
            return z;
        }

    }

    public static void main(String[] args) {
        int a = 5, b = 8, c = 4;

        int max = findMaximum(a, b, c);
        System.out.println("The maximum number is: "+ max);
    }
}
