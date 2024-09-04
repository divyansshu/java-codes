package practice;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int a = 0; a <= 10; a++){
            if (a == 4){
                continue;
            }
    System.out.println(a);
        }

        int i = 0;
        while(i < 10){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
                    i++;
        }

    }
}
