package practice.methods;

import java.util.Scanner;

public class Example {

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println("The sum of "+ a + " and "+ b + " is: " + c);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //invoke or call the sum method
        sum(a, b);

    }
}
