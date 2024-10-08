package UPES_1st_sem.Assignment_1;

import java.util.Scanner;

public class Matrix_Multiplication {

    public static int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {
        
        int[][] arr3 = new int[4][4];
        
        for(int i = 0; i < 4; i++) {
            for(int k = 0; k < 4; k++) {
                for(int j = 0; j < 4; j++) {
                    arr3[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }

        return arr3;
    }

    //method to display the matrices
    public static void display(int[][] arr) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean matricesEqual(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr1[i][j] != arr2[i][j]) return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {

        int[][] A = new int[4][4];
        int[][] B = new int[4][4];

        Scanner sc = new Scanner(System.in);

        //taking elements of first matrix from user
        System.out.println("Enter the elements of first matrix of 4x4");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j <4; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();              
            }
            System.out.println();
        }

        //taking elements of second matrix from user
        System.out.println("Enter the elements of second matrix of 4x4");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //displaying first matrix
        System.out.println("first matrix: ");
        display(A);

        //displaying second matrix
        System.out.println("second matrix: ");
        display(B);

        //multiply A and B
        int[][] AB = matrixMultiplication(A, B);

        //multiply B and A
        int[][] BA = matrixMultiplication(B, A);

        //display AB
        display(AB);

        //display BA
        display(BA);


        //verify whether AB equal to BA
        boolean isEqual = matricesEqual(AB, BA);

        if(isEqual)
        System.out.println("Matrix AB equal to Matrix BA");

        else
            System.out.println("Matrix AB is not equal to Matrix BA");

    }
    
}
