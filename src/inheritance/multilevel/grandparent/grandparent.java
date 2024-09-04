package inheritance.multilevel.grandparent;

public class grandparent {

    public void print() {

        System.out.println("grandparent's print()");
    }
}

    class parent extends grandparent {

        public void print() {

            super.print();
            System.out.println("parent's print()");
        }
    }

    class child extends parent {

    public  void print() {

        //trying to access grandparent's print()
        //super.super.print();
        /* there is an error at line 25 becoz in java, a class cannot directly access the grandparent's members.
        it is allowed in c++. in java, we can access grandparent's members only through the parent class.
         */

        super.print();
        System.out.println("child's print()");
    }
    }
    /* why doesn't java allow accessing grandparent's methods?
    it violates encapsulation. you shouldn't be able to bypass the parent class's behaviour.
     */

