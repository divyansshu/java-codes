package practice;

public class Question13 {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3}, {3,2,1}};
        int row = 2;
        int col = 3;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        int [][]arr2 = {{5,6}, {6,5}};
        int row2 = 2;
        int col2 = 2;
        for (int i = 0; i < row2; i++){
            for (int j = 0; j < col2; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        int [][]arr3 = new int [row][col];
        int k = 0;
        int sum = 0;

        for (int i = 0; i < row; i++){
            for (k = 0; k < col; k++){
                for (int j = 0; j < row2 ; j++){

                    sum += arr[i][k] * arr2[j][i];
                }

                arr3[i][k] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
