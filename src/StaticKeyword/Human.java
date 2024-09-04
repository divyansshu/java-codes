package StaticKeyword;

import java.util.Arrays;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    public static int population; // static data member does not depend on the instances(objects) of the class

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population++;
    }

    public Human() {

    }

    public void display() {

        for (String s : Arrays.asList("name is : " + this.name, "age is : " + this.age, "married : " + this.married, "salary is : " + this.salary, "population is : "+ Human.population))
            System.out.println(s);

    }
    //this function does not depend on objects of the class
    static void fun() {

        // greeting(); //you cannot call non static function like this because it requires an instance
        //and the greeting() function you are using does not depend on any instance

        //you cannot access non static stuff without referencing their instances in a static context

        //hence i am referencing it
        Human obj = new Human();
        obj.greeting();

        System.out.println("hii i am static function");
    }
    void greeting() {

        System.out.println("hii i am inside in non static function greeting ");
    }
    public static void main(String[] args) {

        Human gaurav = new Human(20, "gaurav", 1000000, false);
        Human aman = new Human(22, "aman", 500000, true);
        gaurav.display();
        aman.display();

        Human.fun();

    }
}

