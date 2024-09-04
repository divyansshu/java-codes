package udemy.questions;

public class Switch_Challenge {

    // write your code here
    public static boolean isLeapYear(int year) {

        if (year >= 1 || year <= 9999) {
            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }

        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12)
            return -1;

            if(year < 1 || year > 9999) {
                return -1;
            }

        int value = switch (month) {
            case 1:
                yield 31;
            case 12:
                yield 31;
            case 10:
                yield 31;
            case 8:
                yield 31;
            case 7:
                yield 31;
            case 5:
                yield 31;
            case 3:
                yield 31;
            case 2:
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            case 4:
                yield 30;
            case 11:
                yield 30;
            case 9:
                yield 30;
            case 6:
                yield 30;
            default:
                yield -1;
        };
        return value;
    }

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2, 2020));
    }
}



