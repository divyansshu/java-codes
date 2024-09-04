import java.util.Scanner;

import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the three numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("print the maximum number from "+a + " , "+b + " and "+c);

//        int max = a;
//
//        if(b > max)
//            max = b;
//
//        if (c > max) {
//            max = c;
//        }

//        int max = Math.max(Math.max(a,b),c);

//        System.out.println("maximum number is : "+max);


//        char ch = sc.next().charAt(0);
//        System.out.println(ch);

        String fruit = sc.nextLine();

        if(fruit.equals("mango"))
            System.out.println("king of fruit");

        if(fruit.equals("apple"))
            System.out.println("sweet red fruit");
        else
            System.out.println("tasty");

    }
}