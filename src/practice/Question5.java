package practice;

public class Question5 {
    public static void main(String[] args) {
        int a = 8, b = 10, c = 1;
        if (a > b && b > c) {
            System.out.println(a);
        } else if (a < b && b > c ){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}