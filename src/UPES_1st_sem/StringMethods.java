package UPES_1st_sem;

//length
//substring
//concatenation
//replace
//trim
//join

public class StringMethods {
    public static void main(String[] args) {
        String str = "java Class java";
        System.out.println(str.substring(2,4));
        System.out.println(str.concat(" class"));
        System.out.println(str+" class");
       String str2 = str.replace('a','o');
        System.out.println(str2);
//        System.out.println(str);
       str2 =  str.replace("java","python");
        System.out.println(str2);

       String str5 = String.join(" ","java","python", "C", "C++");
        System.out.println(str5);

        String str3 = "  java  ";
        System.out.println(str3);
        System.out.println(str3.trim());

        String str4 = String.join(",","java", "python");
        System.out.println(str4);




    }
}
