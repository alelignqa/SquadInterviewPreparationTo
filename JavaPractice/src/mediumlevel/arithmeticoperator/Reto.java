package mediumlevel.arithmeticoperator;

import java.util.Scanner;

public class Reto {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

    public static void main(String[] args) {
        Reto.calculator();
    }

    public static void calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int input1 = scan.nextInt();
        System.out.print("Input the second number: ");
        int input2 = scan.nextInt();

        int addition = input1+input2;
        int subtraction = input1 -input2;
        int multiplication = input1*input2;


        System.out.println("Adding the two numbers: " + addition);
        System.out.println("Subtracting: "+subtraction);
        System.out.println("Multiplying two numbers: "+multiplication);

        try {
            //int division = input1/input2; //try catch works here when dividing by 0
            double division = (double) input1/input2; // this says infinity when dividing by 0;
            System.out.println("Dividing two numbers: "+division);
        }catch (Exception exception){
            System.out.println("Please do not include 0 for the second input");
        }

//
//        //mr Hasan did this
//        int result = 0;
//        System.out.println("We are learning");
//
//        try {
//            result= input1/input2;
//            System.out.println("Division value is "+result);
//        } catch (Exception exception){
//            //exception.printStackTrace();
//            System.out.println("This is Arithmetic Exception. Value should be non Zero");
//        }








    }

}


