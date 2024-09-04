package practice;

public class reverse {

    public static void main(String[] args) {
//        int []arr = {1,2,3,4};
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//
//        int []arr2 = new int[arr.length];
//        for (int i = 3; i >= 0; i--){
//
//            arr2[i] = arr[i];
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();



        System.out.println("new");

        int i = 0;
        int j = 4;
        int temp;

        int[] arr3 = {1,2,3,4,5};

        while (i <= j){
            temp = arr3[i];
            arr3[i] = arr3[j];
            arr3[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < arr3.length; k++ ){
            System.out.print(arr3[k] + " ");
        }




    }
}
