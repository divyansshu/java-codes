package practice.Pattern;

public class Question11 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++){
            for (int space = 1; space <= n-i; space++){
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            num = num + 2;
            System.out.println();
        }
        num = 9;
        for (int i = n; i >= 1; i--){
            for (int s = n-i; s >= 1; s--){
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            num = num-2;
            System.out.println();
        }
    }
}
