package practice;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("it is a positive number");
        }
        else if (num < 0){
            System.out.println("it is a negative number");
        }
        else {
            System.out.println("the number is zero");
        }
    }
}
