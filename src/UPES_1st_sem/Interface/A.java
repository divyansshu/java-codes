package UPES_1st_sem.Interface;

public interface A {
    int a = 10; // implicitly final
    void fun();
}

class B implements A {
    @Override
    public void fun() {
        System.out.println("B's implementation of function of interface A");
    }
}

class Main5 {
    public static void main(String[] args) {
       // A obj = new A(); //interface cannot have objects
        B obj = new B();
        obj.fun();
        System.out.println("A.a= "+A.a);
    }
}