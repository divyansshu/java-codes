package Questions.patterns;

//0-1 triangle
public class Pattern11 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                //brute force method
//                if (i % 2 != 0) {
//                    if (j % 2 != 0) {
//                        System.out.print("1 ");
//                    } else {
//                        System.out.print("0 ");
//                    }
//                } else {
//                    if (j % 2 != 0) {
//                        System.out.print("0 ");
//                    } else {
//                        System.out.print("1 ");
//                    }
//                }

                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
