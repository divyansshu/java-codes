package practice;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println("enter the number you want to search");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == num) {
                System.out.println("yes");
                break;
            }
        }




    }
    }

