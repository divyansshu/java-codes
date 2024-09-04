package UpesQuiz;

public class Point {

    int x = 20;
    int y;

    public Point(int a, int b) {
            x = a;
            y = b;
    }
    public Point() {
       this(10,10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.getX());
        System.out.println(p.getY());

    }
}
