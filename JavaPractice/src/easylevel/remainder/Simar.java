package easylevel.remainder;

import java.util.Scanner;

public class Simar {


//    public static void remainder2Num(){
//
       Scanner sc= new Scanner(System.in);
//        System.out.println("enter a whole number");
//        int a = sc.nextInt();
//        System.out.println("enter a whole number");
//        int b = sc.nextInt();
//
//        int c = a/b;
//        int d = a % b;
//
//        System.out.println(a + " / " +b+ "= Remainder" + c);
//        System.out.println("reaminder is " + d);
//
//    }

    public static void main(String[] args) {
        //Simar.remainder2Num();
        Simar.remainder2Num1();
    }

    public static void remainder2Num1(){

        Scanner sc1= new Scanner(System.in);
        System.out.println("enter a number to be divded");
        int num1 = sc1.nextInt();
        System.out.println("enter another number which is the divisor");
        int num2= sc1.nextInt();

        int qoutient=num1 / num2;
        int remainder= num1 % num2;

        System.out.println(" the quotient of the number si=" + qoutient);

        System.out.println("the remainder of the 2 numbers entered is = " + remainder);


    }
}

