package Questions.patterns;

//print square pattern
public class Pattern3 {

    public static void main(String[] args) {

        int n = 4;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
