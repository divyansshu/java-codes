package Questions.patterns;

public class Pattern1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for (int space = 5 - i; space > 0; space--) {

                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {

                System.out.print(j);
            }

            for(int k = 2; k <= i; k++) {

                System.out.print(k);
            }

            for(int space = 5-i; space > 0; space--) {

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
