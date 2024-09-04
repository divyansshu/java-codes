package abstraction.staticMethods;

//java program to illustrate
//static methods in abstract
//class can be called independently

abstract class Helper {

    static void demofun() {
        System.out.println("hii my name is gaurav");
    }
}

class Main extends Helper {

    public static void main(String[] args) {

        Helper.demofun();
    }
}
/* we can define static methods in an abstract class that
can be called independently without an object.
 */