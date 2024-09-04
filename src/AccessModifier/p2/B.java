// Java program to illustrate error while
// using class from different package with
// default modifier

package p2;
import AccessModifier.Default.A;

// This class is having default access modifier
public class B {
    public static void main(String[] args) {

        //accessing class A from package Default
        A a = new A();
        a.display();
    }
}
