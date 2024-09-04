package practice;

public class Question9 {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3} , {4,5,6} , {7,8,9}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == j) {

                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
