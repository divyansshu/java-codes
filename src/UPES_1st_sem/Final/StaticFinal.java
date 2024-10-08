package UPES_1st_sem.Final;

public class StaticFinal {
    static final int ROLL_NO;
    //A static final variable that is not initialized during declaration
    // can only be initialized in static block.


    //cannot assign a value to final variable ROLL_NO
  /*  staticFinal() {
        ROLL_NO = 16549;
    } */

    static {
        ROLL_NO = 16549;
    }

    public static void main(String[] args) {
//        StaticFinal obj = new StaticFinal();
        System.out.println("Roll no. is: "+ StaticFinal.ROLL_NO);
    }
}
