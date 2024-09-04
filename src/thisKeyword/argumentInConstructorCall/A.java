package thisKeyword.argumentInConstructorCall;

//java code for using this as an argument in constructor
//call

//class with object of class B as its data member
public class A {

    B obj;

    //parameterized constructor with object of B
    //as a parameter

    A(B obj) {
        this.obj = obj;

        //calling display method of class B
        obj.display();
    }
}

class B {

    int x = 5;

    //default constructor that create a object of A
    //with passing 'this' as an argument in the
    //constructor
    B() {
        A obj = new A(this);
    }

    //method to show value of x
    void display() {
        System.out.println("value of x in class B : " +x);
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}
