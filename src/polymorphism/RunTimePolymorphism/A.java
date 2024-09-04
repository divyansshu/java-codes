package polymorphism.RunTimePolymorphism;

public class A {
    void m1() {

        System.out.println("inside A's m1 method");
    }
}

class B extends A {

    //overriding m1()
    void m1() {
        System.out.println("inside B's m1 method");
    }

}
    class C extends A {

        //overriding m1()
        void m1() {
            System.out.println("inside C's m1 method");
        }
    }


class Dispatch {
    public static void main(String[] args) {
        A a = new A(); //object of type A

        B b = new B(); //object of type B

        C c = new C(); //object of type C

        //obtain a reference of type A
        A ref;

        //ref refers to an A object
        ref = a;

        //calling A's version of m1()
        ref.m1();

        //now ref refers to a B object
        ref = b;

        //calling B's version of m1()
        ref.m1();

        //now ref refers to a C object
        ref = c;

        //calling C's version of m1()
        ref.m1();

    }
}
