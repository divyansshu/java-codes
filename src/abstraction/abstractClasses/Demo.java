package abstraction.abstractClasses;
/* if the child class is unable to provide implementation to all
abstract methods of the parent class then we should declare that child class as abstract
so that the next level child class should provide implementation
to the remaining abstract method.
 */
abstract class Demo {

    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo {
    @Override
     public void m1() {
        System.out.println("Inside m1");
    }
 }

class SecondChild extends FirstChild {
    @Override
   public void m2() {
        System.out.println("Inside m2");
    }

    @Override
    public void m3() {
        System.out.println("Inside m3");
    }
}

class Main {
    public static void main(String[] args) {

        /* if we remove the abstract keyword from firstchild
        class and uncommented below obj creation for
        firstchild then it will throw
        compile time error as didn't override all the
        abstract methods
         */
//        FirstChild f = new FirstChild();
//        f.m1();

        SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();
    }
}

