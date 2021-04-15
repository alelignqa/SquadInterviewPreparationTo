package easylevel.max;

import java.util.Scanner;

public class Simar {


    public static void main(String[] args) {

       // Simar.maxTwoNum();
        Simar.inputNumMax();

    }

    public static void maxTwoNum() {


        int a = 10;
        int b = 25;


        if (a > b) {

            System.out.println(a + " is the max number");
        } else if (b > a) {
            System.out.println(b + " is the max number");
        }


    }

    public static void inputNumMax() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = input.nextInt();

        System.out.println("enter another number");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the max number");
        } else if (num1<num2) {
            System.out.println(num2 + " is the max number");
        }


    }


}



