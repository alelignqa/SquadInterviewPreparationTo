package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Easha {

    /**
     * //Write a program that accepts three numbers from the user and prints "increasing"
     * // if the numbers are in increasing order, "decreasing" if the numbers are
     * // in decreasing order, and "Neither increasing or decreasing order"
     * // otherwise.
     * // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
     */

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Please give me your first number: ");
        int num1 = num.nextInt();
        System.out.println("Whats your next number? ");
        int num2 = num.nextInt();
        System.out.println("What is your last number? ");
        int num3 = num.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3){
            System.out.println("decreasing");
        }else{
            System.out.println("neither increasing or decreasing");
        }


    }

}
