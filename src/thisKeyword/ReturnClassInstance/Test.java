package thisKeyword.ReturnClassInstance;

//Java code for using 'this' keyword
//to return the current class instance

public class Test {

    int a;
    int b;

    Test() {
        a = 10;
        b = 20;
    }

    //method that returns current class instance
    Test get() {

        return this;
    }

    void display() {
        System.out.println("a = " + a + " b = " +b);
    }

    public static void main(String[] args) {

        Test obj = new Test();

        obj.get().display();

        System.out.println(obj.get());
    }
}
