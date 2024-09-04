package thisKeyword.instance;

//Java code for using 'this' keyword to
//refer current class instance variables
public class Test {

    int a;
    int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {

        System.out.println("a = " + a + " b = "+ b);
    }

    public static void main(String[] args) {

        Test obj = new Test(10, 20);
        obj.display();
    }
}

//this is a reference variable that refers to the current object.