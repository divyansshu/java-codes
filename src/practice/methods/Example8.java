package practice.methods;

public class Example8 {
    public static int digitSum(int n){
        int sum = 0;
        int digit = 0;
        while (n > 0){
              digit = n % 10;
              sum += digit;
              n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
       int sum = digitSum(n);
        System.out.println(sum);
    }
}
