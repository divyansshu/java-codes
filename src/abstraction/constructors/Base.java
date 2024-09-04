package abstraction.constructors;
/* an abstract class can contain constructors in java.
And a constructor of an abstract class is called
when an instance of an inherited class is created. */

abstract class Base {

    //constructor of base class
    Base() {
        System.out.println("Base constructor called");
    }

    //abstract method inside base class
    abstract void fun();
}

class Derived extends Base {

    //constructor of derived class
    Derived() {
        System.out.println("derived constructor called");
    }

    //method of derived class
    @Override
    void fun() {
        System.out.println("derived fun() called");
    }
}

class Main {

    public static void main(String[] args) {

        //creating object of class derived
        //inside main() method

        Derived d = new Derived();
        d.fun();
    }
}
