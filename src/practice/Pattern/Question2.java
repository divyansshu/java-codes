package practice.Pattern;

public class Question2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            for (int j = 0; j < 4-i+1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
