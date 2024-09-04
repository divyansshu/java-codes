package Arrays.example;

public class Student {

    public int roll_no;
    public String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

}

class Main {

    public static void main(String[] args) {

        //declares an array of students;.
        Student[] arr;

        //declaring memory for 5 objects of Student.
        arr = new Student[5];

        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2,"birla");
        arr[2] = new Student(3, "chaman");
        arr[3] = new Student(4,"divyanshu");
        arr[4] = new Student(5, "emraan");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].roll_no+" "+arr[i].name);
        }
    }
}
