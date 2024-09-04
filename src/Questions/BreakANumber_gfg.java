package Questions;

public class BreakANumber_gfg {

    public static int waysToBreakNumber(int N) {

        int count = 0;
//        for(int i = 0; i <= N; i++) {
//
//            for(int j = i; j <= N; j++) {
//
//                if(((N-j) + i + (N-(N-j)-i)) == N)
//                    count++;
//            }
//        }

        count = (N+1) * (N+2) / 2;

        return count;
    }

    public static void main(String[] args) {

        int N = 2;

        System.out.println(waysToBreakNumber(N));
    }
}
