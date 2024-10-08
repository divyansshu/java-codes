package UPES_1st_sem.Interface.multiple_inheritance;

public interface Alpha {
    default void info() {
        System.out.println("I am in alpha interface");
    }
}

interface Beta extends Alpha{
    default void info() {
        System.out.println("I am in beta interface");
    }
}

class Myclass implements Alpha, Beta {

//    @Override
//    public void info() {
////        Beta.super.info();
//        System.out.println("I am in Myclass");
//    }
}

class Main6 {
    public static void main(String[] args) {
Myclass obj = new Myclass();
obj.info();
    }
}