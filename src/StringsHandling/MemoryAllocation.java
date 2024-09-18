package StringsHandling;

public class MemoryAllocation {
    public static void main(String[] args) {
         String str1 = "Hello"; //stored in string pool
        String str2 = "Hello"; // reuse the same object in string pool

        String str3 = new String("Hello"); //creates a new object in the heap

        String str4 = str3.intern(); //forces str3 to be interned in the string pool

        System.out.println(str1 == str2); //true (same object in the string pool)
        System.out.println(str1 == str3); //false (different objects: pool vs heap)
        System.out.println(str1 == str4); //true (str4 refers to the object in the pool)
        System.out.println(str3 == str4); //false (heap vs pool)


    }
}
