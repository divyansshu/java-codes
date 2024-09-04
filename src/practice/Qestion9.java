package practice;

public class Qestion9 {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {6, 7, 8}, {65, 76, 98}};
        int row = 3;
        int column = 3;
        System.out.println("first matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = {{3, 4, 2}, {45, 43, 2}, {78, 8, 9}};
        int row2 = 3;
        int column2 = 3;
        System.out.println("second matrix is:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int arr3[][] = new int[3][3];
        System.out.println("third matrix is:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                arr3[i][j] = arr[i][j] - arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
