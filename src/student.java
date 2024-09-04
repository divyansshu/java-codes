import java.util.Arrays;

public class student {

    public static void main(String[] args) {

        School student1 = new School();// object 1
        School student2 = new School(2, "aman", 95.9f); //object 2
        School student3 = new School(student1); //copying other object data into another object's data : object 3
//        System.out.println(student1.Rno);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);

        student1.greeting();
        student2.greeting();
        student3.greeting();

    }
}
class School { //class
  int Rno; //data members
  String name;
  float marks;

    public School(int rollNO, String naam, float markss) { //parameterized constructor

        this.Rno = rollNO;
        this.name = naam;
        this.marks = markss;
    }

    public School(School other) { //copy constructor
        this.Rno = other.Rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting() { //method of class School
      System.out.println("hii " + name);
        System.out.println("Roll no is : "+Rno);
        System.out.println("marks is : " + marks);
  }
  School() { //default constructor
      this.Rno = 1;
      this.name = "gaurav rawat";
      this.marks = 99.9f;
  }
}
