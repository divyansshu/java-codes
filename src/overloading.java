public class overloading {

    public static void main(String[] args) {

        fun(60);
        fun("gaurav");
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String str) {
        System.out.println(str);
    }
}