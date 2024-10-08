package UPES_1st_sem.object_class.equals_method;

public class A {
    int a;
    A(int x) {
        this.a = x;
    }
}

class B {
    int b;
    B(int y) {
        this.b = y;
    }

    @Override
    public boolean equals(Object obj) {
        B ob1 = (B)obj;
        return (ob1.b == this.b);
    }
}

class Equals {
    public static void main(String[] args) {
        A a1 = new A(10);
        A a2 = new A(20);
        A a3 = new A(10);

        /*
        it is returning false as a output because equals() method is not overridden.
        without overriding the equals() method, it compares the memory addresses of objects.
        equals() method is a method of object class.
        * */
        System.out.println(a1.equals(a2)); //false
        System.out.println(a1.equals(a3)); //false


        B b1 = new B(10);
        B b2 = new B(20);
        B b3 = new B(10);
        System.out.println(b1.equals(b2)); //false
        System.out.println(b1.equals(b3)); //true
    }
}
