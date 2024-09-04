package practice;

public class Homework {
    public static void main(String[] args) {

//        for(int a = 1; a <= 10; a++){
//            if (a % 2 == 0){
//                sum += a;
//            }
//        }
//        System.out.println(sum);
//
//        for (int i = 10; i >=1; i--){
//            System.out.println(i * 10);
//        }
//
//        int sum2 = 0;
//        for (int t = 1; t <= 10; t++){
//            sum2 += t * 8;
//
//        }
//        System.out.println(sum2);
//
//
//        int r = 0;
//        if (r < 0){
//            System.out.println("negative");
//        }
//        else if (r > 0){
//            System.out.println("positive");
//        }
//        else {
//            System.out.println("zero");
//        }
//
//
//        int v = 55;
//        if (v % 5==0 && v % 11==0){
//            System.out.println("number is divisible by 5 and 11");
//        }
//        else {
//            System.out.println("number is not divisible by 5 and 11");
//        }
//
//
//        char s = 'e';
//        if (s == 'a'|| s == 'A'|| s == 'e' || s == 'E' ||
//                s == 'i'|| s == 'I' || s == 'o'|| s == 'O'|| s == 'u' || s == 'U'  ){
//
//            System.out.println("it is a vowel");
//        }
//        else {
//            System.out.println("it is a consonant");
//        }


        int j = 8;
        int h = 9;

        System.out.println("value of h before swaping was" + " " + h);
        System.out.println("value of j before swaping was" + " " + j);
        int k = h;

        h = j;
        j = k;
        System.out.println("value of h after swaping is" + " " + h);
        System.out.println("value of j after swaping is" + " " + j);
    }
}
