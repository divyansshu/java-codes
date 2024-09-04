package java_exercises.exercise1;

import java.util.Scanner;

public class test1 {

    public
    int x;
    int y;

     public void division() {
         System.out.println(x / y);
     }

     public void remainder() {
         System.out.println(x % y);
     }

    public static void main(String[] args) {

         test1 obj = new test1();

         System.out.println("enter two number");

        Scanner sc  = new Scanner(System.in);
        obj.x = sc.nextInt();
        obj.y = sc.nextInt();

        System.out.println("Division of "+obj.x+" and "+obj.y+" is");
        obj.division();

        System.out.println("Remainder of "+obj.x+" and "+obj.y+" is");
        obj.remainder();

    }
}
