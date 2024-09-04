package polymorphism.compileTimePolymorphism;

public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    //second addition function
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        //here, the first addition function is called
        System.out.println(add(2, 3));

        //here the second addition function is called
        System.out.println(add(2.0, 3.0));
    }
}
