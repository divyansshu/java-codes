package Interface.interface_inheritance;

//inheritance in interfaces

 interface intfA {
     void Name();
}

interface intfB extends intfA {
     void Institute();
}

//class implements both interfaces and provides
//implementation to the method.
class sample implements intfB {

    @Override
    public void Name() {
        System.out.println("gaurav");
    }

    @Override
    public void Institute() {
        System.out.println("IHMS");
    }

    public static void main(String[] args) {
        sample obj = new sample();

        //calling the method implemented
        //within the class
        obj.Name();
        obj.Institute();
    }
}
