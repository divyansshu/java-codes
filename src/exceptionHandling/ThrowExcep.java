package exceptionHandling;

// java program  to illustrate the working of throw

class ThrowExcep {

    static void fun() {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("caught inside fun()");
            throw e; //rethrowing the exception
        }
    }

    public static void main(String[] args) {

        try {
            fun();
        }
        catch (NullPointerException e) {
            System.out.println("caught in main");
        }
    }
}
