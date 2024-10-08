package UPES_1st_sem.Super_Keyword;

/*
"Accessing Hidden and Overridden Members in Java Using the super Keyword"
*/
public class Parent {
    String name = "Parent";

            void display(){
                System.out.println("Display method is parent");
            }
}

class Child extends Parent{
    String name = "Child"; //Hides the name variable in parent

    @Override
    void display() {
        System.out.println("Display method is child");
    }

    void show() {
        System.out.println("name in child class: " + name); //refers to child's name
        System.out.println("name in Base class: " + super.name); //refers to parent's name

        display();
        super.display();
    }

}

