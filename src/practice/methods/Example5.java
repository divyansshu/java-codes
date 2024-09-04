package practice.methods;

import java.util.Scanner;

public class Example5 {
    public static int findAverage(int a, int b, int c){

        int avg = (a + b + c ) / 2;
        return avg;

    }

    public static void main(String[] args) {
        System.out.println(" enter 3 numbers");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = findAverage(a , b, c);
        System.out.println(" the average of 3 numbers is:"+ average );
    }



}
