import java.util.Arrays;

public class methods {

//    static int x = 100; //this will be shadowed at line 9
    public static void main(String[] args) {
//
//        System.out.println(x); //100
//
//        int x; //the class variable at line 3 is shadowed by this
//        System.out.println(x);// scope will begin when value is initialized
//
//        x=90;
//        System.out.println(x); //90
//        fun();
//
//    }
//    static void fun() {
//        System.out.println(x);


        //variable length arguments varArgs
        fun(1,2,3,4,5,6,7,8,9);
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}