package java_exercises.exercise1;

import java.util.Scanner;

public class Test3 {

    public void binaryConversion(int n) {
        for (int i = 31; i >= 0; i--) {

            int k = n >> i;
            if ((k & 1) > 0) {
                System.out.print("1");
            } else
                System.out.print("0");
        }
    }

    public static void main(String[] args) {

//        System.out.println("enter any number");
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int rem;
//        int binary[] = new int[100];
//        int i = 0;
//        while (num > 0) {
//
//            rem = num % 2;
//            binary[i++] = rem;
//            num = num / 2;
//        }
//
//        for (int j = i-1; j >= 0 ; j--) System.out.println(binary[j]);

        Test3 obj = new Test3();
        int n = 5;

        System.out.println("Decimal - " + n);
        System.out.println("Binary -");
        obj.binaryConversion(n);

    }
}
