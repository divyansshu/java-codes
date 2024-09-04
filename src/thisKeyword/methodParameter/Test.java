package thisKeyword.methodParameter;

//java code for using 'this'
//keyword as method parameter

public class Test {

    int a;
    int b;

    Test() {
        a = 10;
        b = 20;
    }

    //method that receives 'this' keyword as parameter
    void display(Test obj) {
        System.out.println("a = " +obj.a + " b = "+ obj.b);
    }

    //method that returns current class instance
    void get() {
        display(this);
    }

    public static void main(String[] args) {

        Test obj = new Test();
        obj.get();
    }
}
