package popularjavainterviewquestions.palindrome;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet;

import java.util.Locale;
import java.util.Scanner;

public class Negash {
    //Write a Java Program to find whether a string or number is palindrome or not.
    // 151
    public static void main(String[] args) {
//        Negash.myPalindrome("48984");
//        Negash.myPalindrome("able was I ere I saw Elba");
        Negash.palindromeFromGo(48984);

    }

    public static void myPalindrome(String a) {
        int count = a.length(); // to get the length of the string
        String c = ""; // Declare a new variable to hold my processed String
        while (count > 0) {  // condition for the while loop
            c = c + a.charAt(count - 1);  // concat the last char with the last- (count-1)
            count--;            // decrement till last char
        }
        System.out.println(c.toLowerCase(Locale.ROOT));

        if (a.equalsIgnoreCase(c)) {
            System.out.println("It is a Palindrome ");
        } else System.out.println("Not a Palindrome");

    }

    public static void palindromeFromGo(int num){

        int r;  // to hold a remainder
        int sum = 0;// to hold the processed number

        int newNum = num; // assigning the given num to a new variable for processing
        while (newNum > 0) {// while loop condition
            r = newNum % 10; // get a remainder
            sum = (sum * 10) + r;// reset the sum with the remainder
            newNum = newNum / 10;// divide by 10 since we are dealing with base 10
        }
        System.out.println(sum);


        if (num == sum) {
            System.out.println("The number is a Palindrome");
        } else System.out.println("The number is NOT a Palindrome");


    }


}
