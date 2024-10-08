package UPES_1st_sem.Assignment_1;

import java.util.Scanner;

public class Conversion {

    //print binary conversion of a prime number
    public static void binaryConversion(int num) {
        String binary = "";
        int n = num;
        while(n >= 1) {
            int rem = n%2;
            binary = rem + binary;
            n /= 2;
        }
        System.out.printf("binary representation of %d is: %s%n ", num, binary);
    }

    //print octal conversion of a non prime number
    public static void octalConversion(int num) {
        String octal = "";
        int n = num;
        while(n >=1) {
            int rem = n%8;
            octal = rem + octal;
            n /= 8;
        }
        System.out.printf("octal representation of %d is: %s%n ", num, octal);
    }

    //check whether a number is prime or not
    public static boolean checkPrime(int num) {

        if(num <= 1) {
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        if(checkPrime(num)){
            binaryConversion(num);
        }
        else octalConversion(num);

    }
    
}
