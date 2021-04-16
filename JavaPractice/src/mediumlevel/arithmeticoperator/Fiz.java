package mediumlevel.arithmeticoperator;

import java.util.Scanner;

public class Fiz {


    public static void main(String[] args) {
        Fiz.arithmetic();
    }

    public static void arithmetic() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);
    }
}