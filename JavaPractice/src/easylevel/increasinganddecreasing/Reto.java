package easylevel.increasinganddecreasing;

import java.util.Scanner;

public class Reto {

    /**
     * //Write a program that accepts three numbers from the user and prints "increasing"
     * // if the numbers are in increasing order, "decreasing" if the numbers are
     * // in decreasing order, and "Neither increasing or decreasing order"
     * // otherwise.
     * // Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
     */

    public static void main(String[] args){
        increasingAndDecreasing();
    }

public static void increasingAndDecreasing(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Input first number: ");
    int firstNum = scan.nextInt();
    System.out.print("Input second number: ");
    int secondNum = scan.nextInt();
    System.out.print("Input third number: ");
    int thirdNum = scan.nextInt();

    if(firstNum<secondNum && secondNum<thirdNum){
        System.out.println("Increasing order");
    }else if(firstNum>secondNum && secondNum>thirdNum){
        System.out.println("Decreasing order");
    }else{
        System.out.println("nothing");
    }


}

}
