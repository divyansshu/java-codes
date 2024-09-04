package outputs;

public class Hello {
    public static int x = 7;

    public static void main(String[] args) {
        Hello a = new Hello();
        Hello b = new Hello();
        a.x = 2;
        b.x = 2;
        System.out.println(a.x + b.x + Hello.x);
    }
}
