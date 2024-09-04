package abstraction.Instance;

/*
java program to illustrate
that an instance of abstract
 class cannot be created.
*/

abstract class Base {

    abstract void fun();
}

class Derived extends Base {

    @Override
    void fun() {
        System.out.println("Derived fun() called");
    }
}
class Main {

    public static void main(String[] args) {

      //  Base b = new Base()
        /* base class cannot be instantiated */

        Base b = new Derived();
        b.fun();
    }
}


