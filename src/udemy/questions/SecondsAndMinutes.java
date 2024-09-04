package udemy.questions;

public class SecondsAndMinutes {

    public static String getDurationString(int seconds) {

        int minutes = seconds/60;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(int minutes, int seconds) {
        //1 hr = 60 min
        // 1 hr = 3600 secs
        // 1 min = 60 sec
        // 1 min = 1/60 hr

        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";

    }

    public static void main(String[] args) {

        System.out.println(getDurationString(6000));
        System.out.println(getDurationString(90, 45));

    }
}
