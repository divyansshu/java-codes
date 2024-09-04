package java_exercises.exercise1;

import java.util.Scanner;

public class Test6 {

    public
    int[] arr1 = new int[5];
    int[] arr2 = new int[5];

    public void multiplication(int[] arr1, int[] arr2) {
        int[] arr3 = new int[5];

        for(int i = 0; i < 5; i++) {

            arr3[i] = arr1[i] * arr2[i];
        }
        for(int i = 0; i < 5; i++) {

            System.out.print(arr3[i]);
        }
    }


    public static void main(String[] args) {

        Test6 obj1 = new Test6();
        Test6 obj2 = new Test6();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements of array 1");
        for(int i = 0; i < 5; i++) {
            obj1.arr1[i] = sc.nextInt();
        }

        System.out.println("enter the elements of array 2");
        for(int i = 0; i < 5; i++) {
            obj2.arr2[i] = sc.nextInt();
        }

        System.out.println("array 1 : ");
        for(int i = 0; i < 5; i++) {
            System.out.print(obj1.arr1[i]);
        }

        System.out.println("\narray 2 : ");
        for(int i = 0; i < 5; i++) {
            System.out.print(obj2.arr2[i]);
        }

        System.out.println("\nmultiplication of corresponding elements of array 1 and array2 :");
        obj1.multiplication(obj1.arr1, obj2.arr2);
    }
}
