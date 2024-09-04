package inheritance.single;

 class MountainBikes extends bikes{

     public int seatHeight;

     public MountainBikes(int gear, int speed,int seatHeight ) {
         super(gear, speed);
         this.seatHeight = seatHeight;
     }

     @Override
     public String toString() {
         return (super.toString()+"\n seat height is : "+seatHeight);
     }
 }
