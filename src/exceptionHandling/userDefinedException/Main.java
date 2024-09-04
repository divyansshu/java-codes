package exceptionHandling.userDefinedException;

public class Main {

    public static void main(String[] args) {

        try {
            String name = "Gaurav";
            if (name.equals("Gaurav")) {
                throw new MyException("Name is Gaurav");
            }
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
