package abstraction.AbstractMethods;

/* here if we remove the abstract
keyword from the Demo class then we will get compile
time error due to abstract method
 */
abstract class Demo {

    abstract void m1();
}

class Child extends Demo {

    public void m1() {
        System.out.println("hello");
    }
}

class Main {

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
    }
}
/* if a class contains at least one abstract method
then compulsory we should declare the class as abstract
otherwise we will get compile time error because if a class
contains at least one abstract method then, implementation is not complete for
that class, and hence it is not recommended to create an object
so in order to restrict object creation for such partial classes we use
abstract keyword.
 */
