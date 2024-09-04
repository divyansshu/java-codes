package Questions.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int num = 1;
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(num +" ");
            }
            num++;
            System.out.println();
        }

    }
}
