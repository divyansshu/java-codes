package thisKeyword.constructor;

// Java code for using this() to
// invoke current class constructor

public class Test {

    int a;
    int b;

    Test() {
        this(10, 20); //calling parameterized constructor
        System.out.println("inside default constructor");
    }

    Test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("inside parametrized constructor");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
