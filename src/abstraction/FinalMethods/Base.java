package abstraction.FinalMethods;

//java program to illustrate abstract classes
// can also have final methods.
//final methods cannot be overridden
abstract class Base {
      final void fun() {

        System.out.println("Base fun() called");
    }
}

class Derived extends Base {

}

class Main {

    public static void main(String[] args) {

        //creating object of abstract class
        Base b = new Derived();

        b.fun();
    }
}
