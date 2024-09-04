package Questions;

public class DecimalToBinary {

    public  static void conversion(int n) {

        for(int i = 5; i >= 0; i--) {

            int k = n >> i;
            if((k & 1) > 0)
                System.out.print("1"+" ");

            else
                System.out.print("0"+" ");
        }
    }
    public static void main(String[] args) {

        int n = 4;
        System.out.println("decimal: "+ n);
        System.out.print("Binary: ");
        conversion(n);


    }
}
