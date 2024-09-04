package udemy.questions;

public class MinutesToYearsDaysCalculator {

        public static void printYearsAndDays(long minutes) {

            if(minutes < 0) {
                System.out.println("Invalid Value");
                return;
            }
            // 1 hr = 60 min;
            // 1 day = 24 hr
            // 1 day == 1440 minutes
            // 365 days = 8760 hours
            //1 yr = 525600 minutes

            long years = minutes / 525600;
            long days = minutes % 1440;

            System.out.println(minutes+" min = "+years+"y and "+ days+"d");

        }
        // write your code here
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
