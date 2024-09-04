package practice;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"supra","bmw","ford","honda"};
        System.out.println(cars[0]);
        cars[2] = "alto";
        System.out.println(cars[2]);
        System.out.println(cars.length);

        for (int i = 3; i >= 0; i-- ){
            System.out.print(cars[i] + " ");
        }
    }
}
