package UPES_1st_sem.Static;

public class A {
    static void display() {
        System.out.println("I am in class A");
    }
}

class B extends A {
    //Static methods cannot be overridden
    // because they are associated with the class, not the object.
/*
void display() { //cannot override static methods
        System.out.println("I am in class B");
    }
     */

    static void display() { //this is called method hiding
        System.out.println("I am in class B");
    }
}

class Main4 {
    public static void main(String[] args) {
        //Static methods are methods that belong to the
        // class rather than to any specific instance of the class.
        A.display();
        B.display();

        A obj = new B(); // Reference is of type A, object is of type B
        obj.display(); //Calls Parent's static display method


    }
}
