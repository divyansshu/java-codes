package practice;

public class Question10 {
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
        int k = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 2; j >= 0; j--){
//                if (k == arr.length){
//                    break;
//                }
//                sum += arr[k][j];
//                k++;
                if (i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
