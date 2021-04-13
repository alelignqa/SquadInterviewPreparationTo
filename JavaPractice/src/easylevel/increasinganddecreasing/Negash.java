package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Negash {
    /**
     * //Write a program that accepts three numbers from the user and prints "increasing"
     * // if the numbers are in increasing order, "decreasing" if the numbers are
     * // in decreasing order, and "Neither increasing or decreasing order"
     * // otherwise.
     * // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
     */
    public static void main(String[] args){
        numbers();
    }

    public static void numbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1>num2 && num2>num3){
            System.out.println("Numbers are in decreasing order");
        }else if(num1<num2 && num2<num3){
            System.out.println("Numbers are in an increasing order");
        }else
            System.out.println("No order is recognized ");
    }

}
