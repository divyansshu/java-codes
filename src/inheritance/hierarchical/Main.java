package inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {

        B objB = new B();
        objB.printA();
        objB.printB();

        C objC = new C();
        objC.printA();
        objC.printC();

        D objD = new D();
        objD.printA();
        objD.printD();
    }
}
