package inheritance;

//parent class
public class box {

    double l;
    double h;
     double w;

    box() {

        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

     box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    box (box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    void display() {
        System.out.println(h+" "+w+" "+l);
    }

}
