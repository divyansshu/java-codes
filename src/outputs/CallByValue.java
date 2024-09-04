package outputs;

public class CallByValue {
    int x = 10;
    int y = 20;

    void display(CallByValue A, CallByValue B) {
        A.x = 95;
        System.out.println("x = "+ x);
        System.out.println("y = "+y);
    }

    public static void main(String[] args) {
        CallByValue C = new CallByValue();
        CallByValue D = new CallByValue();
        D.y = 55;
        C.display(C,D);
        D.display(C,D);
    }
}
