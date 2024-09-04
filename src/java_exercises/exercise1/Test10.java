package java_exercises.exercise1;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {

        int[] arr = new int[8];
        int sum = 0;
        int avg;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements of array");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++) {

            sum += arr[i];
        }

        avg = sum/arr.length;
        System.out.println("average of an array is " +avg);

    }
}
