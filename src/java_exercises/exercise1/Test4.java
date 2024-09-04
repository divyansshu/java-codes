package java_exercises.exercise1;

import java.util.Scanner;
import java.lang.String;

public class Test4 {

    public
    String str;
    int countSpace = 0;
    int countNum = 0;
    int countAlpha = 0;
    int countSymbols = 0;


    public void count(String str) {

        char[] ch = str.toCharArray();


        for(int i = 0; i < str.length(); i++) {

            if(Character.isLetter(ch[i]))
                countAlpha++;

           else if(Character.isDigit(ch[i]))
                countNum++;

            else if(Character.isSpaceChar(ch[i]))
                countSpace++;

            else
                countSymbols++;
        }
    }

    public static void main(String[] args) {

        Test4 obj = new Test4();
        System.out.println("enter a string");

        Scanner sc = new Scanner(System.in);
        obj.str = sc.nextLine();

        obj.count(obj.str);
        System.out.println("alphabets count is "+obj.countAlpha);
        System.out.println("Digits count is "+obj.countNum);
        System.out.println("spaces count is "+obj.countSpace);
        System.out.println("symbols count is "+obj.countSymbols);

    }
}
