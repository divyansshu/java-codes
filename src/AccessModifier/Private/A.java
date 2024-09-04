package AccessModifier.Private;

 class A {

     /*private */  public void display() {
         System.out.println("private hu be ese kese access krlega");
     }
 }

class B {

    public static void main(String[] args) {

        A a = new A();
        //trying to access private method of another class
        a.display();
    }
}
