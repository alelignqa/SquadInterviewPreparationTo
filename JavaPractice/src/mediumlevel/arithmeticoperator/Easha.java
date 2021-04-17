package mediumlevel.arithmeticoperator;

//Write Java program to allow the user to input two integer values and then the program prints the results of adding,

import java.sql.SQLOutput;
import java.util.Scanner;

public class Easha {

    public static void main(String[] args) {
        Easha.arithmeticOperator();

    }
    public static void arithmeticOperator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum= num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;

        System.out.println( num1 + " + "+ num2 + " = "+ sum);
        System.out.println( num1 + " - "+ num2 + " = "+ subtraction);
        System.out.println(num1 + " * "+ num2 + " = "+ multiply);
        System.out.println(num1 + " / "+ num2 + " = "+ divide);

    }
    //finished before 10 mins...so probably didnt understand the question
}
