package java_exercises.exercise1;

public class Test8 {
    public static void main(String[] args) {

        for(int i = 1; i <= 4; i++) {
            for (int space = 3; space > i-1; space--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
