package practice;

public class Multidimentionalarray {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3} , {4,5,6} , {7,8,9}};
        arr[0][0] = 21;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int [][]frz = {{32,43} , {21,43} , {65,876} , {654,54}};
        int row = 4;
        int column = 2;
        for (int k = 0; k < row; k++){
            for (int j = 0; j < column; j++){
                System.out.print(frz[k][j] + " ");
            }
            System.out.println();
        }

        }

}
