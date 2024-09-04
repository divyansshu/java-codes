package Questions.patterns;

//hollow rhombus
public class Pattern14 {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j== n)
                    System.out.print("* ");

                else {
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
