package java_exercises.exercise1;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array");
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < 10; i++) {

            if(arr[i] % 2 == 0)
                evenCount++;

            else
                oddCount++;
        }

        System.out.println("\ntotal number of even numbers are "+evenCount);
        System.out.println("total number of odd numbers are "+oddCount);



    }
}
