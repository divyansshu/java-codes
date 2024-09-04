package abstraction.NoAbstractMethods;

//program to illustrate Abstract class
//without any abstract method

//an abstract class without any abstract method
abstract class Base {

    void fun() {
        System.out.println("function of base class is called");
    }
}

class Derived extends Base {
    //this class only inherits the base class methods and properties

}

class Main {
    public static void main(String[] args) {

        Derived d = new Derived();
        d.fun();
    }
}
