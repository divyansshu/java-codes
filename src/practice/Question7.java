package practice;

public class Question7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++){
            if (a[i] % 2!=0){
                System.out.println(a[i]);
            }
        }
        int sum = 0;
        for (int j = 0; j < 5; j++ ){
            sum += a[j];
        }
        System.out.println("sum of this array is" + sum);
    }
}
