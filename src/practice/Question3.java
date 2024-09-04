package practice;

import com.sun.source.tree.WhileLoopTree;

public class Question3 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++){
            System.out.println( "6 x " + a +" = " + 6 * a);
        }

        int a = 1;
        while(a <= 10){
            System.out.println(a * 2);
            a++;
        }
        int c = 1;
        do {
            System.out.println(c * 3);
            c++;
        } while(c <= 10);
    }
}
