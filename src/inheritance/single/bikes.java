package inheritance.single;

public class bikes {

    public int gear;
    public int speed;

    public bikes(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }


    public String toString() {
        return ("number of gears : "+gear+"\n "+ "speed of bicycle is : "+speed);
    }
}