package Questions.patterns;

//printing successive characters in half pyramid
public class Pattern7 {

    public static void main(String[] args) {

        int n = 5;
        char s = 'A';

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
