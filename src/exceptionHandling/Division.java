package exceptionHandling;

//java program to demonstrate working of try,
// catch and finally

public class Division {

    public static void main(String[] args) {

        int a = 10, b = 5, c = 5, result;

        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("not matter what happens this will execute");
        }
    }
}
