package practice.methods;

public class Example7 {
    public static int vowvel(String str){
      int num = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'){
           num++;
            }
    }
        return num;

         }

    public static void main(String[] args) {
        String str = "shinchan";
        vowvel(str);
        int vow = vowvel(str);
        System.out.println(vow);
    }
    }

