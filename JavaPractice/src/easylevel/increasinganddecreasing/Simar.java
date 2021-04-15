package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Simar {

    /**
     * //Write a program that accepts three numbers from the user and prints "increasing" //scanner
     * // if the numbers are in increasing order, "decreasing" if the numbers are
     * // in decreasing order, and "Neither increasing or decreasing order"
     * // otherwise.
     * // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
     */
    public static void numberInOrder() {


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int firstnum = sc.nextInt();
        System.out.println("please enter 2nd number");
        int secondNum = sc.nextInt();
        System.out.println("please enter 3rd number");
        int thirdNUm = sc.nextInt();

        if (firstnum > secondNum && secondNum > thirdNUm) {
            System.out.println("Numbers are in decreasing order");
        } else if (firstnum < secondNum && secondNum < thirdNUm) {
            System.out.println("Numbers are in an increasing order");
        } else
            System.out.println("No order is recognized ");
    }

    public static void main(String[] args) {
        Simar.numberInOrder();
    }

}

