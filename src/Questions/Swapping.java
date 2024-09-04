package Questions;

public class Swapping {

    public static void swap(int a , int b) {
        a = a+b;
       b = a-b;
       a = a-b;
    }
    public static void main(String[] args) {

        int a = 8;
        int b = 2;

//        System.out.println("a: "+ a+"\n"+"b: "+b);
//        a = a+b;
//        b = a-b;
//        a = a-b;
//
//        System.out.println("a: "+ a+"\n"+"b: "+b);

        swap(a, b);
                System.out.println("a: "+ a+"\n"+"b: "+b);


    }
}
