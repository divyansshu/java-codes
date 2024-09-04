package referenceAndObject;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    /* all constructors ,variables and methods inside a class are known as instance variables */
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newheight) {
        this.height = newheight;
    }

    public void setWeight(int newweight) {
        this.weight = newweight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name+", age "+this.age+ " years";
    }
}
