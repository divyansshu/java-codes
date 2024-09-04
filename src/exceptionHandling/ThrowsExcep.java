package exceptionHandling;

//java program to demonstrate working of throws

public class ThrowsExcep {

 /*
     this method throws an exception
     to be handled
     by caller or caller
     of caller and so on.
    */
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    //this is a caller function
    public static void main(String args[]) {

        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}

