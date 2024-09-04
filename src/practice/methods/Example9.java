package practice.methods;

public class Example9 {
public static int character(String str){
    int count = 0;
    for (int i = 0; i < str.length(); i++){
        if ((str.charAt(i) == ' ') || i == str.length() - 1){
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        String str = "my name is khan";
        int cha = character(str);
        System.out.println(cha);
    }
}
