package practice.Pattern;

public class Question6 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int space = n - i; space > 0; space--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
