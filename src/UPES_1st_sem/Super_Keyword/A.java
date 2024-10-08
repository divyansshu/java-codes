package UPES_1st_sem.Super_Keyword;

public class A {
    private int a;

    A(int x) {
        a = x;
        System.out.println("a: "+a);
        System.out.println("I am in class A");
    }
}

class B extends A {
    B() {
        super(10);
        System.out.println("I am in Class B");
    }
}

class Main2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
