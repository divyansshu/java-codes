package practice;

public class Question12 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



        int[][] arr2 = {{4, 5, 6}, {6, 5, 4}, {5, 4, 6}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        int[][] arr3 = new int[arr.length][arr.length];
        int sum = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            for (l = 0; l < arr.length; l++) {
                for (int j = 0; j < arr.length; j++) {

                    sum += arr[i][l] * arr2[j][i];
//                    System.out.print(sum + " ");
                }
                arr3[i][l] = sum;
                sum = 0;
            }

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
