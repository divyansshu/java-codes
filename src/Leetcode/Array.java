package Leetcode;

class Array {

    public int finalValueAfterOperations( String[] operations) {

        int X = 0;

        for(int i = 0; i < operations.length; i++) {

            if(operations[i].charAt(1) == '+') {
                X++;
            }
            else {
                X--;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String[] arr = {"X++","++X","--X","X--"};

        Array a = new Array();
        System.out.println(a.finalValueAfterOperations(arr));
    }

}
