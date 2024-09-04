package java_exercises.exercise1;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first matrix");
        int[][] matrix1 = new int[3][3];

        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the second matrix");
        int[][] matrix2 = new int[3][3];


        for(int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("first matrix ");
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("second matrix ");
        for(int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("sum of first and second matrix is ");

        int[][] matrix3 = new int[3][3];

        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {

                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
                    }


        for(int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
