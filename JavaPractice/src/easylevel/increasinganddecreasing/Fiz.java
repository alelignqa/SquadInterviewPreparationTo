package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Fiz {

    /**
     * //Write a program that accepts three numbers from the user and prints "increasing"
     * // if the numbers are in increasing order, "decreasing" if the numbers are
     * // in decreasing order, and "Neither increasing or decreasing order"
     * // otherwise.
     * // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = scan.nextInt();

        System.out.print("Input second number: ");
        int y = scan.nextInt();

        System.out.print("Input third number: ");
        int z = scan.nextInt();

        if (x < y && y < z){

            System.out.println("Increasing order");

        }



    }


}
