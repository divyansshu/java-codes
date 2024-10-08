package UPES_1st_sem.Assignment_1;

import java.util.Scanner;

public class TwoComplement {

    public static String binaryConversion(int num) {
        
        StringBuilder binary = new StringBuilder();
        int n = Math.abs(num); // Handle absolute value for binary conversion

        // Convert integer to binary representation
        while (n >= 1) {
            int rem = n % 2;
            binary.insert(0, rem);  // Insert remainder at the beginning
            n /= 2;
        }

        // Ensure 32-bit representation 
        while(binary.length() < 32) {
            binary.insert(0, "0");
        }
        // System.out.printf("binary representation of %d is: %s%n ", num, binary);
        return binary.toString();
    }


    public static String twoCompliment(int y) {

        if (y >= 0) {
            return binaryConversion(y); // For positive numbers, just return the binary representation
        }

        String binary = binaryConversion(y); // 32-bit binary representation
        StringBuffer str = new StringBuffer();

        boolean firstOneFound = false; // To track the first '1' from the right

        // Traverse the binary string from the right (starting with the least
        // significant bit)
        for (int i = binary.length() - 1; i >= 0; i--) {
            char currentChar = binary.charAt(i);

            // If we find the first '1', append it as is
            if (currentChar == '1' && !firstOneFound) {
                str.append('1');
                firstOneFound = true; // Now flip all subsequent bits
            }
            // After the first '1', flip the remaining bits
            else if (firstOneFound) {
                if (currentChar == '1') {
                    str.append('0');
                } else {
                    str.append('1');
                }
            }
            // Before the first '1', append bits as they are
            else {
                str.append(currentChar);
            }
        }

        // Reverse the string to correct its order
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any double value: ");
        double x = sc.nextDouble();

        //compute the ceiling num
        int y = (int) Math.ceil(x);

        //print the ceiling value
        System.out.println("Ceiling of "+ x +" is: "+ y);

        //compute the 2's compliment of y
        System.out.println(twoCompliment(y));

    }
    
}
