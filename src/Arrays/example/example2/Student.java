package Arrays.example.example2;

// Java program to illustrate creating
//  an array of objects

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {

        // declares an Array and initializing  the elements of the array
        Student[] arr = new Student[] {
                new Student("gaurav"),
                new Student("divyanshu"),
                new Student("mayank"),
                new Student("kartikey")
        };

//        for (Student i: arr)
//        {
//            System.out.println(i);
//
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
