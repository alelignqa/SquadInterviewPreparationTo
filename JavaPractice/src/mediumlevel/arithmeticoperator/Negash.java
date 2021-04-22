package mediumlevel.arithmeticoperator;

import java.util.Scanner;

public class Negash {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] nums){
//        Negash.operators(20,10,"adding");
//        Negash.operators(20,10,"subtracting");
//        Negash.operators(20,10,"multiplying");
//        Negash.operators(20,10,"dividing");

        Negash.operators1();
    }

            // My 10 mnts ended while I duel with try catch
    public static void operators(int num1, int num2,String operations){
        int result=0;
        if(operations.equalsIgnoreCase("adding")){
            result = num1 + num2;
        }else if(operations.equalsIgnoreCase("subtracting")){
            result = num1 - num2;
        }else if(operations.equalsIgnoreCase("multiplying")){
            result = num1 * num2;
        }else if(operations.equalsIgnoreCase("dividing")){
            try {
                result = num1 / num2;
            }catch (ArithmeticException e){
                System.out.println("Expected error division by zero"+ e.getMessage());
            }
        }
        System.out.println("When two numbers "+num1+ " and "+num2+ " are "+ operations +":"+  +result);

    }

    public static void operators1( ){
        Scanner in = new Scanner(System.in);
        int tr = 4;

        while (tr > 0){
            System.out.println("Welcome to an Arithmetic Operating Machine.  \nPlease enter two numbers you would like to operate");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        Scanner inn = new Scanner(System.in);
        System.out.println("Now tell us what would you like? \nadding, subtracting, multiplying, and dividing are the options ");
        String operations = inn.nextLine();
        int result=0;

            if (operations.equalsIgnoreCase("adding")) {
                result = num1 + num2;
            } else if (operations.equalsIgnoreCase("subtracting")) {
                result = num1 - num2;
            } else if (operations.equalsIgnoreCase("multiplying")) {
                result = num1 * num2;
            } else if (operations.equalsIgnoreCase("dividing")) {
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("Expected error division by zero" + e.getMessage());
                }
            }
            System.out.println("When two numbers " + num1 + " and " + num2 + " are " + operations + ":" + +result);
            tr--;
            if(tr==0){
            in.close(); inn.close();}
        }

    }

}
