package practice.methods;

import java.util.Scanner;

public class Example3 {

    public static void table(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }

    }
    public static void main(String[] args) {
        System.out.println("enter the number between 1 to 10");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        table(user);
    }
}
