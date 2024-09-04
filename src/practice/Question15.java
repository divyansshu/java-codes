package practice;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        System.out.println("enter the size of array");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the elements of the array");


for (int i = 0; i < size; i++){
    arr[i] = sc.nextInt();
}

for (int i = 0; i < size; i++){
    System.out.println(arr[i]);
}

    }
}
