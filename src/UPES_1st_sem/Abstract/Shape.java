package UPES_1st_sem.Abstract;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape{
    double l, b;
    Rectangle(double x , double y) {
        this.l = x;
        this.b = y;
    }

    @Override
    double area() {
        return l*b;
    }
}

class Circle extends Shape {
    double r;
    Circle(double x){
        this.r = x;
    }

    @Override
    double area() {
        return (3.14 * r * r);
    }
}

class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2.5, 3.7);
        System.out.println("Area of rectangle: "+ rect.area());

        Circle cir = new Circle(2.3);
        System.out.println("Area of Circle: "+ cir.area());
    }
}
