package StaticKeyword;

//initialization of static variables
public class StaticInitialization {

    static int a = 4;
    static int b;

    //static block run only once, when the first object is created i.e, when the class is loaded for the first time
    static {
        System.out.println("i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticInitialization obj = new StaticInitialization();
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        StaticInitialization.b += 5;
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        StaticInitialization obj2 = new StaticInitialization();
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);
    }
}
