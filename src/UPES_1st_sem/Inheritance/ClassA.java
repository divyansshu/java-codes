package UPES_1st_sem.Inheritance;

public class ClassA {
    private int a = 10;
    public int b = 20;
    protected int c = 30;
    ClassA(){
        System.out.println("Base class constructor called");
    }
}
class ClassB extends ClassA {

    ClassB(){
        System.out.println("ClassB constructor called");
    }
    void show(){
        // System.out.println(a); //cannot access private members of a base class
        System.out.println(b);
        System.out.println(c);
    }
}

class MainClass {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.show();

       // ClassB obj2 = new ClassA(); //subclasses do not inherit the constructors from the base class
//        ClassB obj3 = (ClassB) new ClassA(); //it will give error
        //java.lang.ClassCastException: ClassA cannot be cast to ClassB


        ClassA obj4 = new ClassB();
    }
}
