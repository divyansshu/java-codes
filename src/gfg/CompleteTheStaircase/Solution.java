package gfg.CompleteTheStaircase;

 class Solution {
   static public int completeRows(int n) {
        //Your code here
        if (n == 1)
            return n;

        int k = 1;
        int row=0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                k++;
                if (k == n) {
                    if (j == i) {
                        row = i;
                        break;
                    } else {
                        row = i - 1;
                        break;
                    }
                }

            }

            if(row != 0)
                break;
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(completeRows(8));
    }
}