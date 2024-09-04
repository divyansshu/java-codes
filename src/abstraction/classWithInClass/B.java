package abstraction.classWithInClass;

//we can use the abstract keyword for declaring top-level
//classes(outer class) as well as inner classes as abstract
abstract class B {

    //declaring inner class an abstract with abstract
    //method
   abstract class C {
       abstract void myAbstractMethod();
    }
}

class D extends B {
    class E extends C {
        //implementing the abstract method


        @Override
        void myAbstractMethod() {
            System.out.println("Inside abstract method implementation");
        }
    }
}

