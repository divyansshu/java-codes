package Interface.realWorldExample;

interface Vehicle {

    //all are the abstract methods
    void changeGear(int a);
     void speedUp(int a);
     void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed : "+ speed + " grear : "+ gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {

        System.out.println("speed : "+speed+" gear : "+gear);
    }
}

class Main {

    public static void main(String[] args) {

        //creating an instance of Bicycle
        //doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        //creating instance of the bike
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state : ");
        bike.printStates();
    }
}

/*An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface,
 not the method body. It is used to achieve abstraction and multiple inheritance in Java.
 In other words, you can say that interfaces can have abstract methods and variables.
 It cannot have a method body. Java Interface also represents the IS-A relationship.

Like a class, an interface can have methods and variables,
 but the methods declared in an interface are by default abstract (only method signature, no body).

Interfaces specify what a class must do and not how. It is the blueprint of the class.
An Interface is about capabilities like a Player may be an interface
and any class implementing Player must be able to (or must implement) move().
So it specifies a set of methods that the class has to implement.
If a class implements an interface and does not provide method bodies for all functions specified in the interface,
 then the class must be declared abstract.*/