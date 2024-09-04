package abstraction.classWithInClass;

public class Main {

    public static void main(String[] args) {

        //instantiating the outer class
        D outer = new D();

        //instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();

    }
}
