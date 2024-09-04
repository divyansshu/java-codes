package java_exercises.exercise1;

import java.util.Scanner;

public class test2 {

    public
    float radius;

    public void area() {
        System.out.println(3.14 * radius * radius);
    }

    public void perimeter() {
        System.out.println(2 * 3.14 * radius * radius);
    }

    public static void main(String[] args) {

        test2 obj = new test2();

        System.out.println("enter the radius of a circle");
        Scanner sc = new Scanner(System.in);

        obj.radius = sc.nextFloat();

        System.out.println("area of a circle is ");
        obj.area();

        System.out.println("perimeter of a circle is");
        obj.perimeter();
    }
}
