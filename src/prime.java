import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        System.out.println(print(n));
    }
    static boolean print(int n) {

        if(n <= 1)
            return false;

        int c = 2;
        while(c * c <= n) {

            if(n % c ==0)
                return false;

            c++;
        }

        return c * c > n;
    }
}