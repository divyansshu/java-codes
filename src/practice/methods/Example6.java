package practice.methods;

public class Example6 {
    public static void middle(String str){
        int mid = str.length() / 2;
        System.out.println(str.charAt(mid));
    }
    public static void main(String[] args) {
        String str = "jadugar";
        middle(str);
    }
}
