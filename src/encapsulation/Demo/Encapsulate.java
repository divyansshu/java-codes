package encapsulation.Demo;

class Encapsulate {

    //private variables declared
    //these can only be accessed by
    //public methods of class
    private String name;
    private int rollNo;
    private int age;

    //get method for age to access
    //private variable age
    public int getAge() {
        return age;
    }

    //get method for name to access
    //private variable name
    public String getName() {
        return name;
    }

    //get method for rollNO to access
    //private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for Age to access
    //private variable age
    public void setAge(int age) {
        this.age = age;
    }

    //set method for Name to access
    //private variable name
    public void setName(String name) {
        this.name = name;
    }

    //set method for RollNo to access
    //private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

    class TestEncapsulation {
        public static void main(String[] args) {

            Encapsulate obj = new Encapsulate();

            //setting values of the variables
            obj.setName("gaurav");
            obj.setRollNo(8);
            obj.setAge(20);

            //displaying values of the variables
            System.out.println("candidate Name : " + obj.getName());
            System.out.println("candidate Roll No : " + obj.getRollNo());
            System.out.println("candidate Age : " + obj.getAge());

            /* direct access of rollN is not possible
            due to encapsulation
            System.out.println("candidate's roll NO : "+obj.rollNo);
             */

        }
    }

