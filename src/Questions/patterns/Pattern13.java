package Questions.patterns;

//solid rhombus
public class Pattern13 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int space = 1; space <= n-i; space++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
