package udemy.questions;

public class MethodOverloading {

    public static double convertToCentimeters(int heightInInches) {

        //1 inch = 2.54cm
        // 1 cm = 1/2.54 inches

        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {

        // 1 foot = 12 inches
        // 1 inch = 1/12 foot

        return convertToCentimeters((heightInFeet * 12) + heightInInches);
    }
    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.convertToCentimeters(5,8)+"cm");

    }
}
