package Questions;

import java.util.Scanner;

public class Prime {

    public static boolean prime(int n) {

        if(n == 1 || n == 0)
            return false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();

        System.out.println(prime(n));


    }
}
