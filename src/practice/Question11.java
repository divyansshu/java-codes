package practice;

public class Question11 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 3;
        int column = 3;
        System.out.println("first matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == arr.length - 1)
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
