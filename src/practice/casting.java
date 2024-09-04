package practice;

public class casting {

    public static void main(String[] args) {

        int num = 3;
        double num5 = num;
        System.out.println(num);

        System.out.println(num5);

        byte mybyte = 21;
        int myint = mybyte;

        System.out.println(mybyte);

        System.out.println(myint);


        //char mychar = 's';
        //int mychintu = mychar;
        //System.out.println(mychar);

        //System.out.println(mychintu);

        double myduo = 2.3432d;
        int myin = (int) myduo;
        System.out.println(myduo);
        System.out.println(myin);

        int my = 65;
        char mych = (char) my;
        System.out.println(my);
        System.out.println(mych);


    }
}
