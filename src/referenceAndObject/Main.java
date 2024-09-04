package referenceAndObject;

public class Main {
    public static void main(String[] args) {

        Person gaurav = new Person("gaurav rawat");
        /* calling a constructor with thw command new causes several things to happen.
        first, space is reserved in the computer memory for storing object variables.
        then default or initialized values are set to object variables
        lastly, the source code in the constructor is executed.
         */
        System.out.println(gaurav);

        Person ball = gaurav;
        ball.growOlder();
        ball.growOlder();

        System.out.println(gaurav);
    }
}
