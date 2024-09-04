package UpesQuiz;

public class Quiz1 {
  int x = 0;
  static int y = 2; //values of variables declared with static remains
    // through out the execution of program and can be accessed.

  void fun() {
      x++;
      --y;
  }
    public static void main(String[] args) {
      Quiz1 obj1 = new Quiz1();
      obj1.fun();
      Quiz1 obj2 = new Quiz1();
      obj2.fun();

        System.out.println("x = "+obj1.x + " y = "+ y);
        System.out.println("x = "+obj2.x + " y = "+ y);

    }
}
