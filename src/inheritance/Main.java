package inheritance;

public class Main {
    public static void main(String[] args) {
//        box box1 = new box();
//        box1.display();
//
//        box box2 = new box(1.2, 2.3, 3.4);
//        box2.display();
//
//        box box3 = new box(box1);
//        box3.display();
//
//        box box4 = new box(4.0);
//        box4.display();

//        boxWeight box5;
//        box5 = new boxWeight();
//        box5.display();

//        System.out.println(box5.h+" "+box5.weight);

//        boxWeight box7 = new boxWeight(2, 3, 4, 8);
//        System.out.println(box7.weight+" "+box7.h+" "+box7.w+" "+box7.l);

//        box box8 = new boxWeight(2, 4, 6, 8);
//        System.out.println(box8.h+" "+box8.l+" "+box8.w);

        /* there are many variables in both parent and child classes
        you are given access to variables that are in the ref type i.e, boxWeight
        hence, you should have access to weight variable
        this also means, that the ones you are trying to access should be initialized
        but here, when the obj itself is of type parent class, you cannot call the constructor of child class
        this is why error is showing in line 36
         */
//        /*child reference variable*/ boxWeight box9 = new box(2, 4, 6); /*parent class object */

    }
}