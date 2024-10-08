package UPES_1st_sem.overridden;

public class A {
    void display(){
        System.out.println("I am in class A");
    }
}
class B extends A{
    @Override
    void display() {
//        super.display();
        System.out.println("I am in class B");
    }
}

class Main3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();

        A obj2 = new B();
        obj2.display(); //calls B display method because object is of B
    }
}
