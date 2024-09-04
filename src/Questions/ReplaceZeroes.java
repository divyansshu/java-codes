package Questions;

public class ReplaceZeroes {

    public static void main(String[] args) {

        int num = 1004;
        System.out.println(replaceZeroes(num));

    }

    private static int replaceZeroes(int num) {
        int result = 0;
        int factor = 1;

        while (num > 0) {
            int digit = num % 10;  // get the last digit
            if (digit == 0) {
                digit = 5;  // replace 0 with 5
            }
            result = result + digit * factor;  // add the modified digit to the result
            factor *= 10;  // update the factor
            num /= 10;  // remove the last digit from num
        }

        return result;
    }
}
