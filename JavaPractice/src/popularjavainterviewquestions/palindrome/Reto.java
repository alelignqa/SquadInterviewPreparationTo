package popularjavainterviewquestions.palindrome;

import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        //Write a Java Program to find whether a string or number is palindrome or not.
        Reto.palindrome();
    }

    public static void palindrome(){
         //we want to build a string from scratch
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string/number to check whether it is a palindrome!!: ");
        String word = scan.nextLine();
        int count = 5; // can only do it 5 times
        while(word !=null && count >0) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) { //The loop runs from the end to the beginning of the string.
                //You start at the last element which has its index at the position length - 1
                // and iterate down to the first element (with index zero).
                reverse += word.charAt(i); //The charAt() method accesses each character of the string.
            }
            System.out.println(reverse);

            if (word.equalsIgnoreCase(reverse)) {
                System.out.println("It is a palindrome!");
            } else {
                System.out.println("It is not a palindrome!");
            }
            count--;
            if (count> 0) {
                word = scan.nextLine();
            }
        }
        scan.close();
    }
}
