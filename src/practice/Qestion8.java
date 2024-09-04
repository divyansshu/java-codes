package practice;

public class Qestion8 {
    public static void main(String[] args) {
        int[] a = {52, 23, 10, 15, 50};
        int b[] = new int[a.length];
        for (int i = 0; i < 5; i++){
             b[i] = a[i];
             System.out.println(b[i]);}

        int max = a[0];
        for (int j = 0; j < 5; j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }
        System.out.println(max);
int l = 66;
boolean result = true;
        for (int k = 0; k < 5; k++) {
            if (l == a[k]) {
                result = true;
                System.out.println("element found" + l);
                break;
            }
            else {
                result = false;}
        }
        if (result == false)
        System.out.println("element not found " + l);
    }
}
