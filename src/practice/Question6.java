package practice;

public class Question6 {
    public static void main(String[] args) {
        int a = 0;
        while(a <= 20){
            if (a % 3 == 0){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
