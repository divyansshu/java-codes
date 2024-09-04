package polymorphism.RunTimePolymorphism.DataMembers;

public class Test {

    public static void main(String[] args) {

        A a = new B(); //object of type B

        //data member of class A will be accessed
        System.out.println(a.x);
    }
}

//in the above program, both the class A(super class) and B(subclass)
// have a common variable 'x'. Now we make object of class B,
// referred by 'a' which is one of type of class A.
// since variables are not overridden, so the statement
// "a.x" will always refer to data member of super class.
