package practice;

public class Condition {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
//      //  if(a > b) {
//            System.out.println("a is greater than b");
//        }
//       // else{
//            System.out.println("a is smaller than b");
//        }


        if(a > b){
            System.out.println("good morning");
        }

        else if(a < b) {

            System.out.println("good afternoon");
        }

        else{
            System.out.println("good evening");
        }

        int day = 8;

        switch(day) {

            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thrusday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("tu alag duniya se h");
        }
    }
}


