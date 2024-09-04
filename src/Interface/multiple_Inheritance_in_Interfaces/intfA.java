package Interface.multiple_Inheritance_in_Interfaces;

// java program to demonstrate multiple inheritance
// in interfaces

 interface intfA {
     void Name();
}

interface intfB {
     void Institute();
}

interface intfC extends intfA, intfB {
     void Branch();
}

//class implements both interfaces and provides
//implementation to the method.
class sample implements intfC {

    @Override
    public void Name() {
        System.out.println("divyanshu");
    }

    @Override
    public void Institute() {
        System.out.println("IHMS");
    }

    @Override
    public void Branch() {
        System.out.println("CSE");
    }

    public static void main(String[] args) {

        sample obj = new sample();
        obj.Name();
        obj.Institute();
        obj.Branch();
    }
}

