public class Singleton {

    private Singleton() {

        System.out.println("hello");
    }
    private static Singleton instance;
    public static Singleton getInstance() {

        //check whether only one object is created or not
        if (instance == null) {

            instance = new Singleton();
        }
        return instance;

    }

    public static void main(String[] args) {
         Singleton obj1 =  Singleton.getInstance();
        Singleton obj2 =  Singleton.getInstance();
        Singleton obj3 =  Singleton.getInstance();


    }
}