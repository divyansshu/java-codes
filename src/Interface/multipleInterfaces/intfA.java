package Interface.multipleInterfaces;

//a class can implement multiple interfaces

interface intfA {
    void m1();
}

interface intfB {
    void m2();
}

//class implements both interfaces
//and provides implementation to the method.
class sample implements intfA, intfB {

    @Override
    public void m1() {
        System.out.println("welcome: inside the method m1");
    }

    @Override
    public void m2() {
        System.out.println("welcome: inside the method m2");
    }
}

class Main {
    public static void main(String[] args) {

        sample obj1 = new sample();

        //calling the method implemented within the class.
        obj1.m1();
        obj1.m2();
    }
}
