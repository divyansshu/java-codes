package objectMethods;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {

        ObjectDemo objectDemo = new ObjectDemo(10);
        System.out.println(objectDemo.hashCode());

        System.out.println(objectDemo instanceof ObjectDemo);
        System.out.println(objectDemo.getClass());
    }
}
