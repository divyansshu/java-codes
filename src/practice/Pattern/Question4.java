package practice.Pattern;

public class Question4 {
    public static void main(String[] args) {
        char alpha = 'A';

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i ; j++){

                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }

    }
}
