package Questions;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if(year >= 1) {
            if (year % 4 == 0) {
                // It's a potential leap year
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        // It's a leap year
                        return true; // System.out.println(year + " is a leap year");
                    } else {
                        // It's not a leap year
                        return false; //System.out.println(year + " is not a leap year");
                    }
                } else {
                    // It's a leap year
                    return true; //System.out.println(year + " is a leap year");
                }
            } else {
                // It's not a leap year
                return false; // System.out.println(year + " is not a leap year");
            }
        }else
            return false;
    }

    public static void main(String[] args) {

        int year = 10000;
        System.out.println(isLeapYear(year));
    }
}
