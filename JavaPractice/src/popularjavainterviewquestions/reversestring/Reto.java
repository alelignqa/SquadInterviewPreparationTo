package popularjavainterviewquestions.reversestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reto {

    /**
     * Write a Java Program to reverse a string without using String
     * inbuilt function.
     */

    public static void main(String[] args) {
//        Reto.reverseStringUsingStringBuilder("Dog");
//        Reto.reverseStringUsingStringBuffer("Dog");
    Reto.reverseString("dog");
    }

    public static void reverseString(String word) {
        String reverse = ""; //we want to build a string from scratch
        for (int i = (word.length())-1; i >=0; i--) { //The loop runs from the end to the beginning of the string.
           // word.length() is 5 but indexing starts from 0 so 0 to 4 so thats why i did length -1 so that it starts from 0
            //You start at the last element which has its index at the position length - 1
            // and iterate down to the first element (with index zero).
            reverse = reverse + word.charAt(i); //The charAt() method accesses each character of the string.
        }
        System.out.println(reverse);
    }


    public static void reverseStringUsingStringBuilder(String word) {
        StringBuilder build = new StringBuilder();
        //String class does not have reverse() method
        //convert the input string to StringBuilder,
        // which is achieved by using the append method of StringBuilder.
        // After that, print out the characters of the reversed string by
        // scanning from the first till the last index.
        build.append(word.toLowerCase()); // append a string into StringBuilder input1

        build.reverse();        // reverse StringBuilder input1

        System.out.println(build);        // reverse StringBuilder input1

    }

    public static void reverseStringUsingStringBuffer(String word) {
        // conversion from String object to StringBuffer
        StringBuffer buffer = new StringBuffer(word.toLowerCase());
        // To reverse the string
        buffer.reverse();
        System.out.println(buffer);
    }
    }















