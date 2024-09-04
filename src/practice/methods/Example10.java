package practice.methods;

public class Example10 {
public static int between(String str){
    int num = 0;
    for (int i = 1; i < str.length() - 1; i++ ){
        if (i != 'a' && i != 'm'){
            num++;
        }
    }
    return num;
}

    public static void main(String[] args) {
        String str = "asdfghjklzxcvbnm";
       int bet =  between(str);
        System.out.println(bet);
    }
}
